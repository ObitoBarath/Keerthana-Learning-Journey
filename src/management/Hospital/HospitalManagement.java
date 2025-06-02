package management.Hospital;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
//        System.out.println("patient = " + patient);

        String name = patient.getName();
        String role = patient.getRole();
        Integer doctorIndex = null;
        if(doctors.size()==0 || wardSize==0){
            System.out.println("Doctors/Ward are not available");
            return;
        }
        for (int i = 0; i<doctors.size(); i++){
            Doctor doc=doctors.get(i);
            if (doc.getRole().equals(role)){
                if(wardSize!=0){
                    Ward wardObj = new Ward(1, doc, patient );
                    wardSize--;
                    doctorIndex=i;
                    break;
//                    doctors.remove(doc);
                }
            }else{
                System.out.println("Unmatched Doctor role: " +doc.getRole());
            }
        }
//        System.out.println("doctorIndex = " + doctorIndex);
        if(doctorIndex!=null){

            Doctor isremove =  doctors.remove(doctorIndex.intValue());
//            System.out.println("isremove = " + isremove);
        }
        else{
            System.out.println("The doctor is busy: " +patient.getRole());
        }



    }
    public void patientDataFromUser(Scanner sc){
        System.out.println("Incoming Patients");
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient name: ");
        String nam = sc.nextLine();
        for (Doctor docRoles :doctors){
            String roles = docRoles.getRole();
            System.out.println("Available doctors :" +roles);
        }
//        System.out.println("available doctors :" + .getRole());
        System.out.println("Enter the doctor's role: ");
        String rol = sc.nextLine();
        System.out.println("Enter the disease: ");
        String dis = sc.nextLine();
        addPatient(new Patient(nam, rol, dis));
//        Patient pat = new Patient()

    }
    public static void main(String[] args){
        HospitalManagement  manager= new HospitalManagement();
        manager.init();
        System.out.println(doctors);
        Scanner sc = new Scanner(System.in);
        while(true) {
//            manager.patientDataFromUser(sc);
            System.out.println("1) add patient: ");
            System.out.println("2) getting doctor details: ");
            System.out.println("3) get patient list: ");
            System.out.println("4) exit: ");
            System.out.println("Enter a number: ");
            int number = sc.nextInt();

            switch(number) {
                case 1 -> {
                    manager.patientDataFromUser(sc);
                }
                case 4 -> {
                    return;
                }
                default -> {
                    return;
                }
            }

        }

//        manager.addPatient(new Patient("Barath" , "A" ,"xyz"));
//        manager.addPatient(new Patient("Keerthana" , "D" ,"xz"));
//        manager.addPatient(new Patient("Keerths" , "C" ,"xz"));
//        manager.addPatient(new Patient("Keerthana" , "A" ,"xz"));
//        System.out.println("doctors.size() = " + doctors.size());
//        System.out.println("wardSize = " + wardSize);
    }
}
