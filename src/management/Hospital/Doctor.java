package management.Hospital;

public class Doctor {
    private String name;
    private String role;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getRole(){
        return this.role;
    }
    public void setRole(String role){
        this.role=role;
    }
    public Doctor(String name, String role){
        this.name=name;
        this.role=role;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
