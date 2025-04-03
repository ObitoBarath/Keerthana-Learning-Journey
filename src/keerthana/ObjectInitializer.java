/*
package keerthana;


import java.util.*;

class A{

    public final void calculator(){
         System.out.println("Calculator");
    }


    // class Book , --> name , author , class Library -->  inperson , computer

}
class B  extends A{

    */
/* @Override
    public final void calculator(){
            System.out.println("Calculator");
    } *//*



    public static void main(String[] args) {

        A aObject = new B();
        B bObject =  new A();

    }



}



















interface Operations {
    default void move() {
        System.out.println("asdasdsad");
    }


    default public void run(){
        System.out.println("Assadsadasdd");
    }

    default  public void run1(){
        System.out.println("Assadsadasdd");
    }
    ///  java 8
}

abstract class AbstractOperation{

    abstract void hello();


    public void run(){
        System.out.println("Assadsadasdd");
    }
}

class Leg extends AbstractOperation {


    @Override
    void hello() {

    }

    public static void main(String[] args) {
        AbstractOperation abstractOperation = new Leg();

        abstractOperation.hello();
    }
}

class  Hand implements  Operations{
    public String name;



    @Override
    public void move(){
        System.out.println("Moving");
    }

    public static void main(String[] args) {



        //load factor 0.75%
        List<String> arrayList  = new ArrayList<>(); //16 elements

        List<String>  strings = new LinkedList<>();


        strings.add("");
        strings.addFirst("");
        strings.addLast("");


        LinkedList<String> strings1 = new LinkedList<>();

        strings1.reversed();




        Hand hand  = new Hand();
        hand.name = "";
        hand.move();;


        Operations operations = new Hand();




        List<String> strings2 = new ArrayList<>();
        List<Integer> integers = new LinkedList<>();

        Set<Palazzo> palazzos = new HashSet<>();

        palazzos.add(new Palazzo("A" , "20"));
        palazzos.add(new Palazzo("A" , "20"));

        System.out.println("palazzos = " + palazzos);







    }
}


class ParentClass{
        public String name ;
}

class ChildClass extends  ParentClass {


    public  void main(String[] args) {

    }
}



public class ObjectInitializer {

//oops -> Inheritance , Abstraction , Polymorphism , Encapsulation // dirrect


}
*/
