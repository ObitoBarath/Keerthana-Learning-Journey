package keerthana.programs;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {

   static public void mapStuffs(){
        Map<String, String> map  = new HashMap<>();

        String firstKey ="FB";
        String secondKey ="Ea";

        System.out.println("firstKey =" + firstKey.hashCode());
        System.out.println("secondKey =" + secondKey.hashCode());

//        4444 % 16

//        index empty ,  4444 --> A

        map.put("A","A");
        map.put("A","D");

        // iteration

        System.out.println("A value = " + map.get("A"));

        map.put(firstKey,  "B");
        map.put(secondKey,  "C");

        String s = map.get(firstKey);
        System.out.println("s = " + s);
        String s1 = map.get(secondKey);
        System.out.println("s1 = " + s1);
    }

    public static void main(String[] args) {
            mapStuffs();
    }
}
