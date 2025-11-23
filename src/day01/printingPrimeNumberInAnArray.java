package day01;

import static java.util.Arrays.stream;

import java.util.Arrays;
import java.util.stream.Collectors;


public class printingPrimeNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 4, 6, 8};
//        Arrays.stream(arr).filter(n->n%2!=0).forEach(System.out::println);
            Arrays.stream(arr).filter(printingPrimeNumberInAnArray::isPrime).forEach(System.out::println);
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0) return false;

        }return true;
    }
}
