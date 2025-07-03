package keerthana.refactoredhm;

import management.Hospital.Doctor;
import management.Hospital.Patient;
import management.Hospital.Ward;

import java.util.*;



public class HospitalHelper extends HospitalAbstraction{

    static Integer wardSize=3;
    static Integer wardNumber=1;
    static List<Doctor> doctors=new ArrayList<>();

    static Map <String, Ward> mapForFetchingPatientData = new HashMap<>();

    public void  patientDataFromUser(Scanner sc)
    {
        System.out.println("Incoming Patients");
        System.out.println("Enter patient name: ");
        String nam = sc.nextLine();
        System.out.println("nam = " + nam);
        for (Doctor docRoles :doctors){
            String roles = docRoles.getRole();
            System.out.println("Available doctors :" +roles);
        }
        System.out.println("Enter the doctor's role: ");
        String rol = sc.nextLine();
        System.out.println("Enter the disease: ");
        String dis = sc.nextLine();
        HospitalUtils.addPatient(new Patient(nam, rol, dis), doctors, wardSize, wardNumber, mapForFetchingPatientData);
    }

    public Object displayDoctor(Integer n, Map<String, Ward> mapValues){

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
    public  Ward matchingIndexValueWithMap(Integer n, List<String> setValue ){
        String gettingName = setValue.get(n-1);
        if(mapForFetchingPatientData.containsKey(gettingName)){
            Ward ward = mapForFetchingPatientData.get(gettingName);
            return ward;
        }
        return null;
    }

    public Map<String, Object> findingIdentity(String anonymous){
        System.out.println("The name is:"+anonymous);
        Map<String, Object> patientDetails=HospitalUtils.isAnonymousNameInPatient(anonymous, mapForFetchingPatientData);
        if(patientDetails!=null && !patientDetails.isEmpty()){
            return patientDetails;
        }
        Map<String, Object> freeDoctor=HospitalUtils.isAnonymousinFreeDoctor(anonymous,doctors );
        if(freeDoctor!=null && !freeDoctor.isEmpty()){
            return freeDoctor;
        }
        Map<String, Object> occupiedDoctors=HospitalUtils.isAnonymousinOccupiedDoctor(anonymous, mapForFetchingPatientData);
        if(occupiedDoctors!=null && !occupiedDoctors.isEmpty()){
            return occupiedDoctors;
        }

        System.out.println("Invalid name");
        return null;

    }

    public String start(){
        HospitalUtils.init(doctors);
        System.out.println(doctors);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1) add patient: ");
            System.out.println("2) getting doctor details: ");
            System.out.println("3) get patient list: ");
            System.out.println("4) Fetch Patient Details: ");
            System.out.println("5) Search: ");
            System.out.println("6) exit: ");
            System.out.println("Enter a number: ");
            int number = sc.nextInt(); // only consume input

            switch (number) {
                case 1: {
                    sc.nextLine(); //  updating the scanner that needs to consume new input
                    patientDataFromUser(sc);
                    break;
                }
                case 2: {
                    HospitalUtils.listingAllAvailableDoctorsNames(doctors);
                    HospitalUtils.listingOccupiedDoctorNames(mapForFetchingPatientData, doctors);
                    int n = sc.nextInt();

                    Object methodOutput = displayDoctor(n, mapForFetchingPatientData);
                    System.out.println(methodOutput);
                    break;
                }
                case 4: {

                    List<String> returningValue = HospitalUtils.displayingDataForTheUser(mapForFetchingPatientData);
                    System.out.println("Enter the option:");
                    int n = sc.nextInt();
                    Ward wardValue = matchingIndexValueWithMap(n, returningValue);
                    System.out.println(wardValue);
                    break;
                }
                case 5: {
                    System.out.println("Enter the name:");
                    Scanner identityScanner = new Scanner(System.in);
                    String anonymous = identityScanner.nextLine();
                    Map<String, Object> identityvalues = findingIdentity(anonymous);
                    System.out.println("identityvalues = " + identityvalues);
                    break;
                }
                default: {
                    sc.close();
                    return null;
                }
            }
        }
    }
}
