package keerthana.programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapOperations {
    public void initMap(){
        Map<Integer, String> newMap = new TreeMap<>();
        newMap.put(1, "keerthana");
        newMap.put(1, "keerthana");
        newMap.put(2, "Barath");
        System.out.println(newMap);
    }
    public void initHashTable(){
        Map<Integer, String> hashTableValues = new HashMap<>();
        hashTableValues.put(null, null);
        hashTableValues.put(null, null);
        System.out.println(hashTableValues);

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
        MapOperations object1 = new MapOperations();
        object1.initMap();
    object1.initHashTable();
    }
}
