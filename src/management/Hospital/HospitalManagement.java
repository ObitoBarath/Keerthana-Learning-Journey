package management.Hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {
    static Integer doctorCount = 3;
    static Integer wardSize=3;
    static List<Doctor> doctors=new ArrayList<>();
    List <Patient> patients = new ArrayList<>();
    public void init(){
        Doctor doctor1=new Doctor("name1", "A");
        doctors.add(doctor1);
        doctors.add(new Doctor("name2", "B"));
        doctors.add(new Doctor("name 3","C"));

    }
    public void addPatient(Patient patient){


    }
    public static void main(String[] args){
        HospitalManagement  manager= new HospitalManagement();
        manager.init();
        System.out.println(doctors);
    }
}
