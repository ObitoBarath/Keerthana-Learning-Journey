package keerthana;

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


    public static  Integer  getValue(){
        return  1;
    }
    public static void main(String[] args)
    {

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
