package keerthana.programs;

public class Student {
    public String name;
    public Integer marks;
    public Student(String name, Integer marks){
        this.name=name;
        this.marks = marks;
    }
    public String getName(){
//        this.name = name;
        return this.name;
    }
    public  Integer getMarks(){
        return this.marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
