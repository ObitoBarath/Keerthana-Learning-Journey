package keerthana.filehandling;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileManager {
    public static void main(String[] args)throws FileNotFoundException, IOException {
//        File obj1 = new File("C:\\Users\\keert\\IdeaProjects\\Keerthana-Learning-Journey\\src\\management\\Hospital\\HospitalToDo.txt");
//        FileReader readerObject = new FileReader(obj1.getPath());
//        BufferedReader bufferReaderObject = new BufferedReader(readerObject);
//
//
////        bufferWriterObject.write("Hello there");
////        bufferWriterObject.write("heyyyy",9,2);
//        String Line ;
//        int count=1;
//        while(( Line=bufferReaderObject.readLine())!=null) {
//            System.out.println("The File Contains: " +Line +"Line number: "+ count);
//            if(count ==9){
//                FileWriter writerObject = new FileWriter(obj1);
//                BufferedWriter bufferWriterObject = new BufferedWriter(writerObject);
//                bufferWriterObject.newLine();
//                bufferWriterObject.write("Hello Barath");
////                writerObject.close();
//                bufferWriterObject.close();
//            }
//            count ++;



//        }bufferReaderObject.close();
//        readerObject.close();

        FileManager object1 = new FileManager();
        List <Students> studentsList = new ArrayList<>();
        object1.fileOperations(studentsList) ;
    }

    public void fileOperations(List<Students> studentsList) throws FileNotFoundException, IOException{
        File fileObject = new File("C:\\Users\\keert\\IdeaProjects\\Keerthana-Learning-Journey\\src\\keerthana\\filehandling\\Students.txt");
        FileReader readerObject = new FileReader(fileObject.getPath());
        BufferedReader bufferedObject = new BufferedReader(readerObject);
        String fileContent;
        Students studentValues = new Students();
        Integer count=1;

        while((fileContent=bufferedObject.readLine())!=null) {
            System.out.println(count);
            if(count%4== 0){
                System.out.println("Added: "+count);
                studentsList.add(studentValues);
                studentValues=new Students();
            }
            if (fileContent.startsWith("Name")) {

                String[] valuesAfterSplit=fileContent.split(":");
//                System.out.println(Arrays.toString(valuesAfterSplit));
//                System.out.println(valuesAfterSplit.length);

                if( valuesAfterSplit.length>=2 && valuesAfterSplit[1]!=null) {
                    studentValues.setName(valuesAfterSplit[1]);

                }

            } else if (fileContent.startsWith("ID")) {

                String[] valuesAfterSplit=fileContent.split(":");
                if(valuesAfterSplit.length >=2 && valuesAfterSplit[1]!=null) {
                    studentValues.setId(valuesAfterSplit[1]);

                }
            } else if (fileContent.startsWith("Course")) {
                String[] valuesAfterSplit = fileContent.split(":");
                if (valuesAfterSplit.length >= 2 && valuesAfterSplit[1] != null) {
                    studentValues.setCourse(valuesAfterSplit[1]);

                }
            }
            count++;
        }
        System.out.println(studentsList.size());
        System.out.println(studentsList);

    }
}
