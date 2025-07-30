package keerthana;

import management.Hospital.Doctor;

import java.util.function.Predicate;

public class EngineHandler {
//return, static ,

    static Engine engine = new Engine("asd" , "asdsd"); //

    public static void calculator(Integer value){

        if (value % 2  ==0){
            value *= 2;
        }else {
            value *= 3;
        }

        if (value >  10)
        {
            System.out.println("Exit from method");
            return;
        }

        value -= 10;
        System.out.println("value = " +value);
    }

    public < T extends Doctor, V > V test(T  string , V secondInput ) {
        System.out.println("test method called with value: " + string);

               return  secondInput;
    }


    public static  Integer  getValue(){
        return  1;
    }
    public static void main(String[] args)
    {
        EngineHandler engineHandler = new EngineHandler();

//        engineHandler.test( , 123);

        System.out.println("Hello");

        Integer value = getValue();

        System.out.println("value = " + value);

        calculator(getValue());


        try{
            System.out.println("a");
            return;
        }catch (Exception e ){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }


        //
        System.out.println("Last !!!!!!!!!!!!");




    }
}
