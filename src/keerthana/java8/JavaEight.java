package keerthana.java8;

import com.sun.source.tree.NewArrayTree;
import management.Hospital.Doctor;
import management.Hospital.Patient;


import javax.print.Doc;
import java.util.Optional;
import java.util.function.*;

public class JavaEight {

//    Functional Interfaces --> Consumer , Predicate,  Supplier, Function ,
//    Lambda Expressions  --> MINIMAL code to implement functional interfaces ( -> )
//    Method Reference ( :: )    ,  where ever the functional interface is needed as input , static method ,  same argument as functional interface
//    Optional Class , --> expected value or null
//    Comparable and Comparator
//    Streams        --->
//    Date/Time API


//functional interface
//
// interface MyFunctionalInterface {
//        void myMethod();
//    }
    public static String myMethod(String k){
        return "Hi";
    }

    public static Boolean keerthanaMethod(Doctor k){
        return k.getName().equals("keerthana");
    }


    public static String test(Predicate<Doctor> k) {
        return k.test(new Doctor(""  , "")) ? "Predicate is true" : "Predicate is false";

    }

    public static void main(String[] args) {

        //Predicate Example , always returns boolean

        String test1 = test(JavaEight::keerthanaMethod);



        String hello = test((myDoctor) -> {
                                  return myDoctor .getName().equals("Hello");
        });


        BiPredicate<Integer, Integer> biPredicate = new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer integer, Integer integer2) {
                return integer > integer2;
            }
        };
        biPredicate.test(10, 20);


        Predicate<Doctor> predicate = (doctor) ->  doctor.equals("keerthana");



        Predicate<Doctor> predicate1 = new Predicate<>() {

            @Override
            public boolean test(Doctor doctor) {
                return doctor.getName().equals("keerthana");
            }

        };

        Doctor doctor = new Doctor("keerthana", "MBBS");

        boolean test = predicate.test(doctor);


        BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " " + s2);
            }
        };

        //Consumer Example, always returns void , inputs can be modified
        Consumer<Patient> consumer = new Consumer<Patient>() {

            @Override
            public void accept(Patient patient) {
                patient.setName("keerthana");
                patient.setRole("KSDFKAFAF");
            }

        };

        consumer.accept(new Patient("keerthana", "MBBS", "1234567890"));


        //Supplier Example, always returns a value, no input
        Supplier<Integer> supplier = new Supplier<>() {

            public Integer incrementer = 0;

            @Override
            public Integer get() {
                return ++incrementer;
            }
        };

        supplier.get();
        supplier.get();
        supplier.get();
        supplier.get();
        supplier.get();
        supplier.get();
        supplier.get();
        supplier.get();

        //Supplier Example, always returns a value, no input


        BiFunction<String, String, String> biFunction = new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s + " " + s2;
            }
        };
        Function<Doctor, String> function = new Function<Doctor, String>() {

            @Override
            public String apply(Doctor doctor) {

                if (predicate1.test(doctor)) {
                    return doctor.getName();
                } else return null;

            }
        };

        String apply = function.apply(new Doctor("", ""));



        Supplier<Doctor> supplierDoctor = new Supplier<>() {

            public Integer incrementer = 0;

            @Override
            public Doctor get() {

                ++incrementer;

                return incrementer == 2 ? new Doctor("keerthana", "MBBS") : null;
            }
        };




        Optional<Doctor> optionalPatient = Optional.ofNullable(supplierDoctor.get());

        optionalPatient.map(Doctor::getName).orElse("");


    }

    @FunctionalInterface
    interface keerthana {
        void myMethod();
    }
}
