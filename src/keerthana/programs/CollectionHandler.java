package keerthana.programs;

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

        for(int i=0; i<name.size(); i++ ){
        String sum = name.get(i);
        Integer sums = value.get(i);
        Integer convstring=Integer.valueOf(sum);
        Integer multipliedValue = sums * convstring;
//            System.out.println(multipliedValue);
//            System.out.println(sum);
//            System.out.println(sums);
          String multipliedString = String.valueOf(multipliedValue) ;
          name.set(i, multipliedString);

        }
        System.out.println(name);
        for(int i=0; i<name.size();i++) {
            String sum = name.get(i);
            Integer sums = value.get(i);
            objectList.add(sum );
            objectList.add(sums);
            Integer convstring = Integer.valueOf(sum);
            String convInteger = String.valueOf(sums);
            if(i%2 !=0){
            name.set(i, convInteger);
            value.set(i, convstring);}
//            else{
//                name.set(i, sum);
//                value
//            }

        }
        for(int i=0; i<objectList.size(); i++) {
            Object referenceValue = objectList.get(i);
            Integer intValue = null;

            if (referenceValue instanceof String) {
              String stringValue = String.valueOf(referenceValue) ;
              intValue = Integer.valueOf(stringValue);
            }
            else{
                intValue = (int) referenceValue;
            }
            if(intValue !=0){
               objectList.remove(intValue);
            }}
            System.out.println(objectList);

//        System.out.println("namelist =" +name);
//        System.out.println("valuelist =" +value);





    }
}
