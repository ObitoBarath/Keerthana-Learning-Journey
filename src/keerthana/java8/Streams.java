package keerthana.java8;

import java.io.Serializable;
import java.lang.classfile.constantpool.ConstantPool;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {


    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        // filter , map ,

        //intermediate operations

        list.add("Banana");
        list.add("Orange");
        list.add("Banana");

        list.add("Grapes");
        list.add("Apple");
        list.add("Apple");




        Stream<String> stream = list.stream();

        List<String> collect = stream.filter((s) -> {
            System.out.println("s1 = " + s);
            return s.contains("e");  // filter operation
        }).toList();


        //map operation
        Map<String, List<String>> e = collect.stream().map(
                (m) -> {
                    System.out.println("intermediate = " + m);
                    if (m.contains("e")) {
                        return m;
                    } else {
                        return null;
                    }
                }
        ).collect(Collectors.groupingBy(Function.identity()));




    /*    e.entrySet().stream().collect(Collectors.toMap(k-> {
            return k;
        }, v -> {
                            return v;
            } , (previouseEntry , nextEntry) ->{


        }));*/



        System.out.println("e = " + e);



        // terminal operation



        System.out.println("collect = " + collect);



    }
}
