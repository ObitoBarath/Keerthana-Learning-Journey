package management.Hospital;

import java.io.*;
import java.util.Objects;

public class Patient implements Externalizable {

    private Long serialVersionUID = 1298347231984723L;

    private transient String name;
    private String role;
    private String disease;
    private transient int age;
    private volatile boolean isCured = false;

    public Patient(String name, String role, String disease) {
        this.name = name;
        this.role = role;
        this.disease = disease;


        if (!isCured) {
            System.out.println("not cured");


            System.out.println("curing process");
            isCured = true;

        } else {
            System.out.println("cured");
        }

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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age && Objects.equals(name, patient.name) && Objects.equals(role, patient.role) && Objects.equals(disease, patient.disease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role, disease, age);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
                              if (!name.equals("Barath")){
                                  out.writeObject(name);
                              }

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {


    }
}
