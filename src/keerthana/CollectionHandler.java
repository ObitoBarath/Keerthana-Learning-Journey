package keerthana;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class CollectionHandler {


    Book[] array  = {new Book() , new Book() , new Book()};

    public static void main(String[] args) throws InterruptedException {

        // iterable
        int[] arraysOfInteger = new int[]{1,2,4,5};
        String[] arraysOfString = new String[]{"sadfsadufsdufgsuaf , ssdfsdf"};

        String string = "Asds";

        //for loop
        String string1 ="";
        for (int i = 3 ; i >= 0 ; i--){
            System.out.println("Reverse Element = " + arraysOfInteger[i]);
                string1 =  string1 += string.charAt(i);
        }

        for (int i = 0 ; i < arraysOfInteger.length ; i++){
            int element  =  arraysOfInteger[i];
            System.out.println("element = " + element);
        }

        // for each loop
        for (int element : arraysOfInteger){

            System.out.println("i =" + element);

        }

        //while
        int i = 0;
        while (i <= 10){
            System.out.println("iteration count = " + i);

            i++;
        }

        // do while
        int j = 0;
        do {
            System.out.println("do while count "+ j);
            j++;

        }while (j <= 10 );

        //

        //crud

        List<String> list = new LinkedList<>(); // ArrayList , LinkedList
        list.add("ASDS1");
        list.add("ASDS2");
        list.add("ASDS3");
        list.add("ASDS4");
        list.add("ASDS5");
        list.add("ASDS5");
        list.add("ASDS5");
        list.add("ASDS5");
        list.add(1 , "Keerthana");
        list.remove(0);
        list.remove("Keerthana");
// can store Duplicates

        for (int k = 0 ;  k <  list.size() ; k++ ){
            String s = list.get(k);
//            System.out.println("value =" + s);
        }

        for (String value : list){
//            System.out.println("value =" +value);
        }


        Set<Integer> integers = new TreeSet<>(); // hashSet , LinkedHashSet , TreeSet
        integers.add(1);
        integers.add(6);
        integers.add(3);
        integers.add(7);
        integers.add(0);
        integers.add(13);
        // can't store Duplicates

        for (int i1 = 0 ; i1< 10 ;i1++){
            integers.add(i1);

        }

        System.out.println("list" +list);
        System.out.println("set " +integers);

/*
        for (Integer value : integers){
            System.out.println("value =" +value);
        }*/


        Stack<String> stack = new Stack<>();
        stack.add("1");
        stack.add("12");
        stack.add("0");
        stack.add("112");
        stack.push("asdsadsa");
        stack.pop();

        System.out.println("stack = " + stack);
        String peek = stack.peek();
        stack.addFirst("asdfsdfds");
        System.out.println("peek = " + peek);


        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder()); // ArrayDequqe , PriorityQueue
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        queue.add("7");
        queue.add("1");
        System.out.println("queue ==>" + queue);
        String poll = queue.poll();
        String peek1 = queue.peek();
        System.out.println("peek1 ==>" + peek1);


        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("1");
        deque.addLast("2");


    


          //
        //123456 ,  //76543211



    }

}
