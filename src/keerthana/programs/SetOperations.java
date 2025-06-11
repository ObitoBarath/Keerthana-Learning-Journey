package keerthana.programs;

import management.Hospital.Doctor;
import management.Hospital.Patient;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class SetOperations {
    public void listToSetConversion(){
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(5);
        values.add(2);
        values.add(9);
        values.add(5);
        Set<Integer> setValues = new LinkedHashSet<>();
        for(int i=0; i<values.size(); i++) {
            Integer listValues = values.get(i);
            setValues.add(listValues);
        }
        System.out.println(setValues);
    }
    public Set<Patient> setOperationsWithPatient(){
        Set<Patient> patientSet = new HashSet<>();
        Patient patientRefernce = new Patient("A ", "xyz","fever");
        patientSet.add(new Patient("A", "xyz","fever"));
        patientSet.add(patientRefernce );
        patientSet.add(patientRefernce);
//        patientSet.add(new Patient("A", "xyz","fever"));
//        patientSet.add(new Patient("B", "xy","cough"));
        System.out.println(patientSet);
       return patientSet;
    }

    public void stringSetOperations(){
        Set <String> names = new HashSet<>();
        names.add("abc");
        names.add("ABC");
        names.add("efg");
        System.out.println(names);
    }

    public static void main(String[] args) {
        SetOperations object1 = new SetOperations();
        object1.listToSetConversion();
//        object1.setOperationsWithPatient();
         object1.stringSetOperations();
    }
}
