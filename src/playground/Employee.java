package playground;

public class Employee {
    String name;
    String department;
    Integer salary;

    Employee(String name, String department,Integer salary) {
        this.name = name;
        this.department = department;
        this.salary=salary;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public Integer getSalary(){return this.salary;}
    public void setSalary(Integer salary){this.salary=salary;}
}
