package management.Hospital;

public class Patient {
    private String name;
    private String role;
    private String disease;

    public Patient(String name, String role, String disease) {
        this.name = name;
        this.role = role;
        this.disease = disease;
    }

    public String getName() {
        return name;
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
}
