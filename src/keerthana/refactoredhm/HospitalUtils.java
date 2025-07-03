package keerthana.refactoredhm;

import management.Hospital.Doctor;
import management.Hospital.Patient;
import management.Hospital.Ward;

import java.util.*;

public class HospitalUtils {
//    HospitalHelper helperObject = new HospitalHelper();


    static public void addingDataInPatientFetchMap(String patientName, Ward ward, Map <String, Ward> mapForFetchingPatientData){
//        String patientName = Patient.getName();
          mapForFetchingPatientData.put(patientName, ward);

    }

    static public void addPatient(Patient patient, List<Doctor> doctors,Integer wardSize, Integer wardNumber,  Map <String, Ward> mapForFetchingPatientData ) {
//        System.out.println("patient = " + patient);

        String name = patient.getName();
        String role = patient.getRole();
        Integer doctorIndex = null;
        if (doctors.size() == 0 || wardSize == 0) {
            System.out.println("Doctors/Ward are not available");
            return;
        }
        for (int i = 0; i < doctors.size(); i++) {
            Doctor doc = doctors.get(i);
            if (doc.getRole().equals(role)) {
                if (wardSize != 0) {
                    Ward wardObj = new Ward(wardNumber++, doc, patient);
                    wardSize--;
                    doctorIndex = i;
                    addingDataInPatientFetchMap(name, wardObj, mapForFetchingPatientData);
                    break;
//                    doctors.remove(doc);
                }
            } else {
                System.out.println("Unmatched Doctor role: " + doc.getRole());
            }
        }
//        System.out.println("doctorIndex = " + doctorIndex);
        if (doctorIndex != null) {

            Doctor isremove = doctors.remove(doctorIndex.intValue());
//            System.out.println("isremove = " + isremove);
        } else {
            System.out.println("The doctor is busy: " + patient.getRole());
        }

    }


    static public Map<String, Object> isAnonymousNameInPatient(String anonymous,Map<String, Ward> mapForFetchingPatientData){
            Map<String, Object> searchOperationMap = new TreeMap<>();
            if (mapForFetchingPatientData.containsKey(anonymous)){
                searchOperationMap.put("isPatient ","true");
                searchOperationMap.put("isDoctor ","false");
                searchOperationMap.put("Patient Details",mapForFetchingPatientData.get(anonymous));
                return searchOperationMap;
            }return null;
    }


    static public Map<String, Object> isAnonymousinFreeDoctor(String anonymous, List<Doctor> doctors){
            Map<String, Object> searchOperationMap = new TreeMap<>();
            for(Doctor doctor:doctors){
                String doctornames = doctor.getName();
                if(doctornames.equals(anonymous)){
                    searchOperationMap.put("isDoctor ","true");
                    searchOperationMap.put("isPatient ","false");
                    searchOperationMap.put("Free Doctor Details: ", doctor);
                    return searchOperationMap;
                }
            }return null;
    }

    static public Map<String, Object> isAnonymousinOccupiedDoctor(String anonymous, Map<String, Ward> mapForFetchingPatientData){
        Map<String, Object> searchOperationMap = new TreeMap<>();
        Collection<Ward> occupiedDoctors = mapForFetchingPatientData.values();
        for(Ward doctors: occupiedDoctors){
            Doctor doctor = doctors.getDoc();
            String doctorName=doctor.getName();
            if(doctorName.equals(anonymous)){
                searchOperationMap.put("isDoctor ","true");
                searchOperationMap.put("isPatient ","false");
                searchOperationMap.put("Available doctor details", doctors);
                return searchOperationMap;
            }
        }return null;
    }

    static public void init(List<Doctor> doctors) {
        Doctor doctor1 = new Doctor("name1", "A");
        doctors.add(doctor1);
        doctors.add(new Doctor("name2", "B"));
        doctors.add(new Doctor("name3", "C"));

    }

    static public void listingAllAvailableDoctorsNames(List<Doctor> doctors){
        for(int i=0; i<doctors.size(); i++){
            Doctor availableDoctorName =doctors.get(i) ;
            System.out.println(i+1+")"+availableDoctorName.getName());
        }
    }
    static public void listingOccupiedDoctorNames(Map <String, Ward> mapForFetchingPatientData,List<Doctor> doctors ){
        Collection<Ward> occupiedDoctornames=mapForFetchingPatientData.values();
        Integer count = doctors.size();
        for(Ward names: occupiedDoctornames){
            Doctor doctor=names.getDoc();
            System.out.println(++count +")"+ doctor.getName());
        }
    }

    static public List<String> displayingDataForTheUser(Map <String, Ward> mapForFetchingPatientData){
        Set<String> gettingName = mapForFetchingPatientData.keySet();
        List<String> setToList = new ArrayList<>();
        int count =0;
        for(String valuesFromSet : gettingName){
            setToList.add(valuesFromSet);
            System.out.println(++count+ valuesFromSet);
        }
        return setToList;
    }


}
