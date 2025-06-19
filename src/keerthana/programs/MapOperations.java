package keerthana.programs;

import java.util.*;


public class MapOperations {
    public void initMap() {
        Map<Integer, String> newMap = new TreeMap<>();
        newMap.put(1, "keerthana");
        newMap.put(1, "keerthana");
        newMap.put(2, "Barath");
        System.out.println(newMap);
    }

    public void initHashTable() {
        Map<Integer, String> hashTableValues = new HashMap<>();
        hashTableValues.put(null, null);
        hashTableValues.put(null, null);
        System.out.println(hashTableValues);
    }
    public void mapClasses(){
        Map <Integer, String> newMap= new LinkedHashMap<>();
        newMap.put(1, "ClassA");
        newMap.put(7, "Class6");
        newMap.put(4, "Class4");
        newMap.put(4, "Class4");
        System.out.println(newMap);

        Map<Integer, Integer> map2 = new TreeMap<>();
        map2.put(-1, 100000);
        map2.put(2,2);
        map2.put(0,0);
        System.out.println(map2);
        Integer getValue = map2.get(-1);
        System.out.println(getValue);
        Set<Integer> setvalue=map2.keySet();
        // keyset is for to take only the key values, which returns data in set
        Collection<Integer> setvalues = map2.values();
        //values is for get the values from the map, which returns data in collection
        Set<Map.Entry<Integer, Integer>> entries = map2.entrySet();
        // entry set is to take all keys and values, which returns data in set
        System.out.println(entries);
//        for(Map.Entry<Integer, Integer> i: entries){
//          Integer key = i.getKey();
//          Integer value = i.getValue();
//            System.out.println(key + " "+ value);
//            map2.put(8,7);
//        }map2.containsKey(-1);
//        map2.containsKey(2);
//        map2.clear();
//        map2.isEmpty();
////        map2.remove();
    }

    static public void mapStuffs() {
        Map<String, String> map = new HashMap<>();

        String firstKey = "FB";
        String secondKey = "Ea";

        System.out.println("firstKey =" + firstKey.hashCode());
        System.out.println("secondKey =" + secondKey.hashCode());

//        4444 % 16

//        index empty ,  4444 --> A

        map.put("A", "A");
        map.put("A", "D");

        // iteration

        System.out.println("A value = " + map.get("A"));

        map.put(firstKey, "B");
        map.put(secondKey, "C");

        String s = map.get(firstKey);
        System.out.println("s = " + s);
        String s1 = map.get(secondKey);
        System.out.println("s1 = " + s1);
    }

    public void listMapOperations(){
        List<String>names = new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Banana");
        names.add("Apple");
        names.add("Banana");
        names.add("Orange");
        int count = 1;
        String init = names.get(0);
        System.out.println(names);
        Map <String,Integer> mapValues = new TreeMap<>();
//        for(int i=0; i<names.size(); i++){
//            String listValues = names.get(i);
//            mapValues.put(i,listValues);
//        }
//        System.out.println(mapValues);
        for(int i=1; i<names.size(); i++){
            String listValues = names.get(i);
            count = 1;
            if (mapValues.containsKey(listValues)) {
                Integer valueVariable=mapValues.get(listValues);
                mapValues.put(listValues,valueVariable+1);
            }
            else{
                mapValues.put(listValues,count);
            }

        }
        System.out.println(mapValues);

    }



    public static void main(String[] args) {
        MapOperations object1 = new MapOperations();
//        object1.initMap();
//        object1.initHashTable();
        object1.mapClasses();
//        object1.listMapOperations();
    }
}

/*
* iterate the list
* check whether the key is already present
* yes -> get value and increment it
* no -> put key with 1 value
*/
