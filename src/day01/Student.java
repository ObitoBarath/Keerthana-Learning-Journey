package day01;

import java.util.*;

public class Student {
    public Integer id;
    public String name;
    public Integer marks;

    public Student(Integer id, String name, Integer marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public Integer getMarks(){
        return this.marks;
    }
    public Character getGrade(){
        int m=marks;
        if (marks>=90) return 'A';
        else if (marks>=75) return 'B';
        else if(marks>=60) return  'C';
        else if (marks >=40) return 'D';
        else return 'F';
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Keerthana",90));
        studentList.add(new Student(2,"DD",80));
        studentList.add(new Student(3,"CC",70));
        studentList.add(new Student(4,"BB",60));
        studentList.add(new Student(5,"AA",30));

        Map<Student,Character> mapWithStudentDetailsAndGrade=new HashMap<>();
        for(Student list:studentList) {
           Character grade= list.getGrade();
           mapWithStudentDetailsAndGrade.put(list,grade);
        }
        System.out.println(mapWithStudentDetailsAndGrade);

    }
}
