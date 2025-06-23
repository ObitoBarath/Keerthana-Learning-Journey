package management.Hospital;


import javax.print.Doc;
import java.util.*;

public class HospitalManagement {
    static Integer doctorCount = 3;
    static Integer wardSize=3;
    static Integer wardNumber=1;
    static List<Doctor> doctors=new ArrayList<>();
    List <Patient> patients = new ArrayList<>();
   static Map <String, Ward> mapForFetchingPatientData = new HashMap<>();
    public void init(){
        Doctor doctor1=new Doctor("name1", "A");
        doctors.add(doctor1);
        doctors.add(new Doctor("name2", "B"));
        doctors.add(new Doctor("name3","C"));
//        for(Doctor doctornames:doctors){
//            String names = doctornames.getName();
//        }
        //        String doctornames= doctor1.getName();

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
                    Ward wardObj = new Ward(wardNumber++, doc, patient );
                    wardSize--;
                    doctorIndex=i;
                    addingDataInPatientFetchMap(name, wardObj);
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
        System.out.println("nam = " + nam);
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
            System.out.println("4) Fetch Patient Details: ");
            System.out.println("5) exit: ");
            System.out.println("Enter a number: ");
            int number = sc.nextInt(); // only consume input

            switch(number) {
                case 1 : {
                    sc.nextLine(); //  updating the scanner that needs to consume new input
                    manager.patientDataFromUser(sc);
                    break;
                }
                case 2:{
                    manager.listingAllAvailableDoctorsNames();
                    manager.listingOccupiedDoctorNames();
                    int n= sc.nextInt();

                    Object methodOutput = manager.displayDoctor(n,mapForFetchingPatientData);
                    System.out.println(methodOutput);
                    break;
                }
                case 4: {

                    List<String> returningValue =  manager.displayingDataForTheUser();
                    System.out.println("Enter the option:");
                    int n = sc.nextInt();
                    Ward wardValue=manager.matchingIndexValueWithMap(n, returningValue);
                    System.out.println(wardValue);
                    break;
                }
                default:{
                    sc.close();
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
    public void addingDataInPatientFetchMap(String patientName, Ward ward){
//        String patientName = Patient.getName();
        mapForFetchingPatientData.put(patientName, ward);

    }

    public List<String> displayingDataForTheUser(){
        Set<String> gettingName = mapForFetchingPatientData.keySet();
        List<String> setToList = new ArrayList<>();
        int count =0;
        for(String valuesFromSet : gettingName){
            setToList.add(valuesFromSet);
            System.out.println(++count+ valuesFromSet);
        }
        return setToList;
    }
    public  Ward matchingIndexValueWithMap(Integer n, List<String> setValue ){
        String gettingName = setValue.get(n-1);
        if(mapForFetchingPatientData.containsKey(gettingName)){
            Ward ward = mapForFetchingPatientData.get(gettingName);
            return ward;
        }
        return null;
    }
    public void listingAllAvailableDoctorsNames(){
        for(int i=0; i<doctors.size(); i++){
            Doctor availableDoctorName =doctors.get(i) ;
            System.out.println(i+1+")"+availableDoctorName.getName());
        }
    }
    public void listingOccupiedDoctorNames(){
         Collection<Ward> occupiedDoctornames=mapForFetchingPatientData.values();
        Integer count = doctors.size();
         for(Ward names: occupiedDoctornames){
             Doctor doctor=names.getDoc();
             System.out.println(++count +")"+ doctor.getName());
         }
    }
    public Object displayDoctor(Integer n, Map<String,Ward> mapValues){

        if(n<doctors.size()) {
            Doctor availableDoctor = doctors.get(n-1);
            System.out.println("is available now");
           return availableDoctor;
        }
        else{
            int count=0;
            Collection<Ward> displayingOccupDocNames=mapValues.values();
            for(Ward ocupDocNames: displayingOccupDocNames){
                ++count;
                if(n-doctors.size() == count){
                    System.out.println("is on duty");
                    return ocupDocNames;
                }

            }

        }
        System.out.println("Enter the valid number");
        return null;

    }
}


