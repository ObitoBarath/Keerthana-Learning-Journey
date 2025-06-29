package keerthana.filehandling;

public class Students {
    String name;
    String id;
    String course;

    public Students() {
        this.name=getName();
        this.id=getId();
        this.course=getCourse();
    }

    public Students(String name, String id, String course){
        this.name=name;
        this.id=id;
        this.course =course;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
