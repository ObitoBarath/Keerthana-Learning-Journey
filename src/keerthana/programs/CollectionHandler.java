package keerthana.programs;

import management.Hospital.Patient;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Gatherer;

public class CollectionHandler {
    public static void main(String[] args) {
        List<String> name = new LinkedList<>();
        name.add("4");
        name.add("5");
        name.add("6");

        List<Integer> value = new LinkedList<>();
        value.add(1);
        value.add(2);
        value.add(3);
        List<Object> objectList = new LinkedList<>();

        for (int i = 0; i < name.size(); i++) {
            String sum = name.get(i);
            Integer sums = value.get(i);
            Integer convstring = Integer.valueOf(sum);
            Integer multipliedValue = sums * convstring;
//            System.out.println(multipliedValue);
//            System.out.println(sum);
//            System.out.println(sums);
            String multipliedString = String.valueOf(multipliedValue);
            name.set(i, multipliedString);

        }
        System.out.println(name);
        for (int i = 0; i < name.size(); i++) {
            String sum = name.get(i);
            Integer sums = value.get(i);
            objectList.add(sum);
            objectList.add(sums);
            Integer convstring = Integer.valueOf(sum);
            String convInteger = String.valueOf(sums);
            if (i % 2 != 0) {
                name.set(i, convInteger);
                value.set(i, convstring);
            }
//            else{
//                name.set(i, sum);
//                value
//            }

        }
        for (int i = 0; i < objectList.size(); i++) {
            Object referenceValue = objectList.get(i);
            Integer intValue = null;

            if (referenceValue instanceof String) {
                String stringValue = String.valueOf(referenceValue);
                intValue = Integer.valueOf(stringValue);
            } else {
                intValue = (int) referenceValue;
            }
            if (intValue != 0) {
                objectList.remove(intValue);
            }
        }
        System.out.println(objectList);

//        System.out.println("namelist =" +name);
//        System.out.println("valuelist =" +value);
         CollectionHandler object1 = new CollectionHandler();
         List <Integer> numbers = new LinkedList<>();
         numbers.add(5);
         numbers.add(8);
         numbers.add(3);
         object1.getMaximumNumber(numbers);
         List <Patient> patients = new LinkedList<>();
//         Patient patient1=new Patient("barath","xy","x");
//         patients.add(patient1);
//         patients.add(new Patient("keerthana", "zy","z"));
//         Patient patientByRole=object1.getPatientByrole(patients,"xy");

         patients.add(new Patient("abi", "aa","q", 21));
         patients.add(new Patient("miri", "bb","r", 23));
         patients.add(new Patient("togo", "cc","s", 20));
         Patient patientByAge = object1.getPatientsAge(patients);

    }
    public Integer getMaximumNumber(List <Integer> numbers){
        Collections.sort(numbers);
        Integer maximum = numbers.get(0);
        for(int i=1; i<numbers.size(); i++){
            if (numbers.get(i)<maximum){
                maximum=numbers.get(i);
//            for(int j=i+1; j<numbers.size(); j++){
//                if (numbers.get(i) < numbers.get(j)){
//                    maximum = numbers.get(i);
//                }
            }

        }System.out.println("Maximum number is : " +maximum);
        return maximum;
    }
//    public Patient getPatientByrole(List <Patient> patients, String role){
//        for(Patient patent:patients){
//            if(patent.getRole().equals(role)){
//               return patent;
//            }
//        }return null;
//
//    }

     public Patient getPatientsAge(List <Patient> patients){
//        for(Patient patent:patients){
         Patient maximum = patients.get(0);
         for(int i =1; i<patients.size(); i++){
                Patient patent = patients.get(i);

            if(patent.getAge() > maximum.getAge()){
                maximum= patent;

            }}
             System.out.println("Maximum age patient is: " +maximum.getAge());

         return maximum;
    }
}
