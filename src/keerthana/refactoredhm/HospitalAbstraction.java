package keerthana.refactoredhm;

import management.Hospital.Ward;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

abstract public  class HospitalAbstraction {
    public abstract void  patientDataFromUser(Scanner sc);
    public abstract Object displayDoctor(Integer integer, Map<String, Ward> mapValues);
    public abstract Ward matchingIndexValueWithMap(Integer n, List<String> setValue);
    public abstract Map<String, Object> findingIdentity(String anonymous);

}
