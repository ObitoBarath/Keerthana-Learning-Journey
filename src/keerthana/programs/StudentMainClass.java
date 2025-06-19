package keerthana.programs;
import java.util.*;

public class StudentMainClass {
    List<Student> students = new ArrayList<>();
    Map <String, Integer> mapValues = new LinkedHashMap<>();



    public void constructSizeToStringListMap() {

        List<String> mockData = new ArrayList<>();
        mockData.add("apple");
        mockData.add("orange");
        mockData.add("car");
        mockData.add("cat");
        mockData.add("dog");



        Map<Integer , List<String>> map = new HashMap<>();

        for (String value : mockData){
            Integer stringLength = value.length();

            if (map.containsKey(stringLength)){
                List<String> valueList =  map.get(stringLength);

                valueList.add(value);
            }else {
                List<String> list = new ArrayList<>();

                list.add(value);

                map.put(stringLength , list);

            }
        }
        System.out.println("map = " + map);




    }




    public void addStudentAndFindMaximumMarks()
    {
        Map<String , Student> studentMap = new HashMap<>();

        Student student1 = new Student("keerthana", 7);
        Student student2 = new Student("AAA", 1);
        Student student3 = new Student("BBB", 5);

        studentMap.put(student1.getName() , student1);
        studentMap.put(student2.getName() , student2);
        studentMap.put(student3.getName() , student3);

        Integer maximumMarks = 0;
        Student maximumMarkStudent = null;


        for (Map.Entry<String ,Student> entry : studentMap.entrySet()){

            String key = entry.getKey();

            Student value = entry.getValue();

            if(value.getMarks() > maximumMarks){
                maximumMarks = value.getMarks();
                maximumMarkStudent = value;

            }

        }


        System.out.println("maximumMarks = " + maximumMarks);
        System.out.println("maximumMarkStudent = " + maximumMarkStudent);



    }
    /*
    * 1.getting each index value from the list
    * 2. */

    public void listAndMapOperations(){
        List<String> listData = new ArrayList<>();
        listData.add("apple");
        listData.add("bat");
        listData.add("cat");
        listData.add("elephant");
        listData.add("dog");
        Map<Integer, List<String>> mapData =new TreeMap<>();
        for(String names:listData){
            Integer lengthOfNames = names.length();
            List<String> lengthList = new ArrayList<>();
            lengthList.add(names);
            mapData.put(lengthOfNames,lengthList);
        }
    }

    public void studentData() {
        students.add(new Student("keerthana", 7));
        students.add(new Student("AAA", 1));
        students.add(new Student("BBB", 5));
        students.add(new Student("AAA", 10));
        for(int i=0; i<students.size(); i++){

            Student values = students.get(i);
//            System.out.print(values);
            if(mapValues.containsKey(values.getName())){

                String nameValues = values.getName();
                System.out.println(nameValues);
                Integer markValues = values.getMarks();
                System.out.println(markValues);
                Integer previousmark =  mapValues.get(nameValues);
                System.out.println(previousmark);
                mapValues.put(nameValues, previousmark+markValues);


            }
            else{
                mapValues.put(values.getName(), values.getMarks());
            }

            System.out.println("mapValues = " + mapValues);
        }
            System.out.println(mapValues);
Set<Map.Entry<String, Integer>> maximum= mapValues.entrySet();

Integer compare=0;
String maxScorer =" ";
        for( Map.Entry<String, Integer> i:maximum){

            if(i.getValue()>compare){
                compare=i.getValue();
                maxScorer = i.getKey();
            }

        } System.out.println(compare+"is scored by"+maxScorer);


    }
    public static void main(String args[]){
        StudentMainClass object1 = new StudentMainClass();
//        object1.studentData();
//        object1.addStudentAndFindMaximumMarks();
        object1.constructSizeToStringListMap();

    }

}
/*
* Adding students in a list
*
* iterating the list
* if same key contains means, adding their values in a map
* no map store with their values
* map maximum find*/
