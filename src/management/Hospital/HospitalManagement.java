package management.Hospital;

import com.sun.org.apache.bcel.internal.generic.DCONST;

import javax.jws.Oneway;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {
    static Integer doctorCount = 3;
    static Integer wardSize=3;
    static List<Doctor> doctors=new ArrayList<>();
    List <Patient> patients = new ArrayList<>();
    public void init(){
        doctors.add(new Doctor("name2", "B"));
        doctors.add(new Doctor("name 3","C"));
        Doctor doctor1=new Doctor("name1", "A");
        doctors.add(doctor1);

    }
    public void addPatient(Patient patient){
        System.out.println("patient = " + patient);

        String name = patient.getName();
        String role = patient.getRole();

        for (Doctor doc : doctors){
            if (doc.getRole().equals(role)){
                // wards
            }
        }



    }
    public static void main(String[] args){
        HospitalManagement  manager= new HospitalManagement();
        manager.init();
        System.out.println(doctors);

        manager.addPatient(new Patient("Barath" , "A" ,"xyz"));
    }
}
