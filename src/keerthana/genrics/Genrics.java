package keerthana.genrics;

import management.Hospital.Doctor;
import management.Hospital.Patient;


public class Genrics<M , N> {



    public <U> M predicate(M m, N n  ) {

        if  (m instanceof Doctor){
            Doctor doctor = (Doctor) m;
            if (doctor.getName().equals("keerthana")) {
                return m;
            }
        }                else if (m instanceof Patient) {
            Patient patient = (Patient) m;
            if (patient.getName().equals("keerthana")) {
                return m;
            }
        }
        return null;


    }


    public String test(M num1 , N num2) {


        // api http://localhost:8080/keerthana/genrics/


        return  "";
    }

    public String test(Integer num1 , Integer num2) {

        int i = (int) ( num1 + num2 );


        return  String.valueOf(i);
    }

    public String test(Double num1 , Integer num2) {

        int i = (int) ( num1 + num2 );


        return  String.valueOf(i);
    }

    public static void main(String[] args) {
        Genrics<?,?> genrics = new Genrics<>();
    }
}
