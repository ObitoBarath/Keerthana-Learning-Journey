package playground;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;
import java.util.stream.Collectors;

public class PlayGround {
    //1. Count words starting with "A"
    public long countOfWordsWtihA() {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");
        Long count=words.stream().filter(n->n.startsWith("A")).count();
        return count;
    }

    // 2. Sort a list of strings by length
    public List<String> listSortedByLength(){
        List<String> words = Arrays.asList("Java", "Spring", "Hibernate", "React");
        List<String>sortedList=words.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        return sortedList;
    }


//3. Group employees by department

    /*

    class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }

      List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Charlie", "IT"),
                new Employee("David", "Finance"),
                new Employee("Eva", "HR")
            );
     */
    static List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT"),
            new Employee("Bob", "HR"),
            new Employee("Charlie", "IT"),
            new Employee("David", "Finance"),
            new Employee("Eva", "HR")
    );
    public Map<String,List<String>>  groupingEmployeeByDepartment(List<Employee> employees ){
        Map<String, List<String>> employeeeMap = new HashMap<>();
        for(Employee values:employees){
            String department = values.getDepartment();
            String name =values.getName();
            if(employeeeMap.containsKey(department)){
                employeeeMap.get(department).add(name);
            }
            else{
                List<String> names = new ArrayList<>();
                names.add(name);
                employeeeMap.put(department, names);
            }
        }return employeeeMap;
    }
    // 4.          Math
    public void Math(){
        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8, 9));

    }
/*
     Multiply each list value by 2 and add them

     (1 *2) + (2*2) + (3*2) ,  (4*2) + (5*2) ,  (6*2) + (7*2) + (8*2) + (9*2)
     add them up and get the first highest value and multiply with the second highest value and divide by 4.5 and print the result with 5 digits after decimal point
    (12 , 18 , 30) => 30 * 18 / 4.5 = 120.00000 // final answer
    */
static Map<Integer, String> palazzoMap = new HashMap<>();

    public  void mapData() {
        palazzoMap.put(101, "Alice");
        palazzoMap.put(102, "Bob");
        palazzoMap.put(103, "Charlie");
        palazzoMap.put(104, "Diana");
        palazzoMap.put(105, "Eve");
        palazzoMap.put(106, "Frank");
        palazzoMap.put(107, "Grace");
        palazzoMap.put(108, "Hannah");
        palazzoMap.put(109, "Ivan");
        palazzoMap.put(110, "Jack");
        palazzoMap.put(111, "Karen");
        palazzoMap.put(112, "Leo");
        palazzoMap.put(113, "Mona");
        palazzoMap.put(114, "Nina");
        palazzoMap.put(115, "Oscar");
        palazzoMap.put(116, "Paul");
        System.out.println(palazzoMap);
//        System.out.println(palazzoMap.get(114));
//        System.out.println(palazzoMap.remove(116));
//        System.out.println(palazzoMap.containsKey(116));
//        System.out.println(palazzoMap.size());
//        System.out.println(palazzoMap.isEmpty());
//        palazzoMap.clear();
//        Set<Integer> keyFromMap = palazzoMap.keySet();
//        System.out.println(keyFromMap);
//        Collection<String> valuesFromMap = palazzoMap.values();
//        System.out.println(valuesFromMap);
//        Set<Map.Entry<Integer, String>> entries = palazzoMap.entrySet();
//        System.out.println(entries);
    }

    public void mapOperations(Map<Integer, String> palazzoMap){
        System.out.println("The map values are: "+palazzoMap);
        System.out.println("The value of 114 is: "+palazzoMap.get(114));
        System.out.println("Going to remove the 116 key and it's value: "+palazzoMap.remove(116));
        System.out.println("whether the map contains 116 key: "+palazzoMap.containsKey(116));
        System.out.println("size of palazzo map is : "+palazzoMap.size());
        System.out.println("is the palazzo map is empty : "+palazzoMap.isEmpty());

        Set<Integer> keyFromMap=palazzoMap.keySet();
        System.out.println("Key data are"+keyFromMap);
        Collection<String> valuesFromMap=palazzoMap.values();
        System.out.println("values are "+valuesFromMap);
        Set<Map.Entry<Integer, String>> entries = palazzoMap.entrySet();
        System.out.println("Key and values are" +entries);
        palazzoMap.clear( );
    }

    //5. Create a Custom Map named as  PalazzoMap and it should have below functionalities

    // minimum capacity of map should be 16
    /*
        1. put(key, value) -> to add key value pair
        2. get(key) -> to get value by key
        3. remove(key) -> to remove key value pair by key
        4. containsKey(key) -> to check if key exists
        5. size() -> to get the size of the map
        6. isEmpty() -> to check if the map is empty
        7. clear() -> to clear the map
        8. keySet() -> to get all keys in the map
        9. values() -> to get all values in the map
        10. entrySet() -> to get all key value pairs in the map
     */
    public static void main(String[] args) {
        PlayGround object1 = new PlayGround();
//        object1.countOfWordsWtihA();
//        Employee object2=new Employee();
        object1.listSortedByLength();
        Map<String,List<String>> sortedOutput=object1.groupingEmployeeByDepartment(employees);
        System.out.println(sortedOutput);
        object1.mapData();
        object1.mapOperations(palazzoMap);




    }

}
