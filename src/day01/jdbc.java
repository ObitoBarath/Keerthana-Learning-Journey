package day01;
import java.sql.*;
public class jdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "Keerthana@1607";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
//                String city = rs.getString("city");

                // Print student info + grade
                char grade;
                if(marks>=90) grade='A';
                else if(marks>=75) grade='B';
                else if(marks>=60) grade='C';
                else if(marks>=40) grade='D';
                else grade='F';

                System.out.println(id + " | " + name + " | " + marks  + " | Grade: " + grade);
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
1. connect the jdbc driver using this command
            Class.forName("com.mysql.cj.jdbc.Driver");
2. giving the credentidal, url, username, password
            url format: String url = "jdbc:mysql://localhost:3306/studentdb;
3. Create a connection with sql workbench like
            Connection con = DriverManager.getConnection(url, username, password);
4. Once the connection is done, should create a statement, to run the queries
            Statement state = con.createStatement();
5. Once the statement is done, should give the queries as ResultSet
            ResultSet res = state.executeQuery("Select * from students");
6. Once the select query run, should store the data in some variables like,
            int id = res.getInt("id");
            String name=res.getString("name");
            int marks =res.getId("marks");
7. Should process the logic with result srt and should close all the connections, statement and resultset like,
            res.close();
            state.close();
            con.close();

 */

