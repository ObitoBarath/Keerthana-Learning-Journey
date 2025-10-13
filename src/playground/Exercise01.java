package playground;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercise01 {
    public static void main(String[] args) {
            Exercise01 object1 = new Exercise01();
            //numberOfOccurrences
//        Map<String, Long> output = object1.numberOfOccurrences();
//        output.entrySet().stream().filter(n->n.getValue()>1).forEach(n-> System.out.println(n.getKey()+'-'+n.getValue()));
            //mostRepeatedChar
//        Map<Character,Long> mostRepeatedCharcterOutput=object1.mostRepeatedChar();
//        Long maxCount=mostRepeatedCharcterOutput.values().stream().max(Long::compare).orElse(0L);
//        mostRepeatedCharcterOutput.entrySet().stream().filter(n->n.getValue()==maxCount).forEach(n-> System.out.println(n.getKey()+"-"+n.getValue()));
            //longestPalindrome
//        object1.longestPalindrome();
//            object1.anagramsCount();
            object1.personProblemJavaBrain();

        }
        public Map<String, Long> numberOfOccurrences () {
            List<String> words = Arrays.asList("java", "spring", "java", "microservices", "spring", "java");
            Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));
            return wordCount;

        }
        public Map<Character,Long> mostRepeatedChar(){
            String input = "successes";
            char[] inputAsChar=input.toCharArray();
            Map<Character,Long> outputMap=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(word->word,Collectors.counting()));
            System.out.println(outputMap);
            return outputMap;
        }
        public void longestPalindrome(){
            List<String> words = Arrays.asList("level", "radar", "apple", "banana", "madamimadam");
            Integer macCount=words.stream().map(n->n.length()).max(Integer::compare).orElse(0);
            words.stream().filter(n->n.length()==macCount).forEach(n-> System.out.println(n));
        }
        public void anagramsCount(){
            List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
            Map<String,List<String>>anagramMap=words.stream().collect(Collectors.groupingBy(n->{char[] value=n.toCharArray(); Arrays.sort(value); return new String(value);}));
            System.out.println(anagramMap);
        }
        public void personProblemJavaBrain(){
            List<Person> myPerson = Arrays.asList(
                    new Person("Keerth","Cana",12),
                    new Person ("Sape","xshini",13),
                    new Person ("Yokesh","waran",15));
            List<Person> outputList=myPerson.stream().filter(n->n.getLName().startsWith("C")).collect(Collectors.toList());
            System.out.println(outputList);
            List<Person> addList=new ArrayList<>();
            for(Person words:myPerson){
                String fname=words.getFName();
                String lname=words.getLName();
                Integer age=words.getAge();
            }
        }

    }



