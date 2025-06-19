package keerthana.programs;
import java.util.*;

public class StudentMainClass {
    List<Student> students = new ArrayList<>();
    Map <String, Integer> mapValues = new LinkedHashMap<>();
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
        object1.studentData();
    }

}
/*
* Adding students in a list
*
* iterating the list
* if same key contains means, adding their values in a map
* no map store with their values
* map maximum find*/
