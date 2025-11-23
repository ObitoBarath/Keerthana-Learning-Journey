package day01;

import java.sql.*;
import java.util.Locale;

public class StudentCRUD {
//    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "Keerthana@1607";

        public void addStudent(int id, String name, int marks){
            String query="INSERT INTO student(id,name,marks) VALUES (?,?,?)";
            try(Connection connection = DriverManager.getConnection(url, user,password);){
//            Class.forName("com.mysql.cj.jdbc.Driver");
            PreparedStatement statement = connection.prepareStatement(query);
//            ResultSet resultSet=statement.executeQuery("INSERT INTO student values (?,?,?)");
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setInt(3,marks);
            int rows=statement.executeUpdate();
            System.out.println(rows);
            System.out.println(rows>0? "Student added successfully":"Insertion failed");

            statement.close();
            connection.close();

        }
        catch (SQLException e){
//            e.printStackTrace();
            System.out.println("Error in Database: "+e.getMessage());
            }
    }
    public void getStudentById(int id){
            try(Connection connection=DriverManager.getConnection(url,user,password)) {
                String query="Select * from student where id = ?";
                PreparedStatement statement1 = connection.prepareStatement(query);
                statement1.setInt(1,id);
                ResultSet resultSet = statement1.executeQuery();
                if(resultSet.next()){
                    System.out.println("The name is : "+resultSet.getString("name"));
                    System.out.println("The id is : "+resultSet.getInt("id"));
                    System.out.println("The mark is : "+resultSet.getInt("marks"));
                }
                else{
                    System.out.println("No results found for the given id");
                }
                resultSet.close();
                statement1.close();
//                connection.close();
            }
            catch(SQLException e){
                System.out.println("Database error: "+e.getMessage());
            }

    }
    public void updateStudentMarks(int id, int newMarks) {
            String query="UPDATE student set marks=? where id=?";
            try(Connection connection = DriverManager.getConnection(url,user,password)){
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1,newMarks);
                preparedStatement.setInt(2,id);
                int rows=preparedStatement.executeUpdate();
                System.out.println(rows>0?"updation has been done":"updation failed");
//                getStudentById(id);
                String query02="Select * from student where id=?";
                PreparedStatement statement02=connection.prepareStatement(query02);
                statement02.setInt(1,id);
                ResultSet resultSet = statement02.executeQuery();
                if(resultSet.next()) {
                    System.out.println(resultSet.getString("name") + " score has been updated into" + resultSet.getInt("marks"));
                }
                resultSet.close();
                statement02.close();
                preparedStatement.close();
                        }
            catch (SQLException e){
                System.out.println("Dayabase error"+e.getMessage());
            }
    }
    public void deleteStudent(int id){
            String query="delete from student where id=?";
            try(Connection connection = DriverManager.getConnection(url,user,password)){
                PreparedStatement statement=connection.prepareStatement(query);
                statement.setInt(1,id);
                int rows=statement.executeUpdate();
                System.out.println(rows>0?"Deletion has been done":"Error in deletion");
                statement.close();
            }
            catch(SQLException e){
                System.out.println("Database error : "+ e.getMessage());
            }
    }
    public static void main(String[] args) {
        StudentCRUD object1=new StudentCRUD();
//        object1.addStudent(46,"Yokesh",90);
//        object1.getStudentById(45);
//            object1.updateStudentMarks(1,95);
        object1.deleteStudent(2);

    }

}
