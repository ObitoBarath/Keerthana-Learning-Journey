package management.Hospital;

public class Patient {
    private String name;
    private String role;
    private String disease;
    private int age;

    public Patient(String name, String role, String disease) {
        this.name = name;
        this.role = role;
        this.disease = disease;

    }
    public Patient(String name, String role, String disease, int age){
        this.name = name;
        this.role = role;
        this.disease = disease;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public Integer getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }
}
