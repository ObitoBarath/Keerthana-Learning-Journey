package keerthana.java8;

import java.util.ArrayList;
import java.util.List;

public class trappingRainWater {
    public static void main(String[] args) {
        Integer height[]={4,2,0,3,2,5};
//        char[] heightInChar=height.toCharArray();
        int rb=height[0];
        int lb = height[height.length-1];
        int target = 0;
        int sum=0;
        if (rb>lb){
            target=lb;            }
        else target=rb;
        System.out.println(target);
        for(int i=1; i<=height.length-2; i++){
            sum+=target - height[i];
        }
        System.out.println("The total number of trapped rain water is:"+sum);
        trappingRainWater object1= new trappingRainWater();
        object1.missingNumber();
//        object1.xorLogic();
        List<Boolean>methodOutput=object1.kidsWithGreatestNumberOfCandies();
        System.out.println(methodOutput);
        object1.maximumWealth();
    }

    public void missingNumber(){
        Integer integer[]={9,6,4,2,3,5,7,0,1};
        int n= integer.length;
        int sumValue= n*(n+1)/2;
        System.out.println(sumValue);
        Integer output=0;
        for(int i=0; i<integer.length; i++){
            sumValue=sumValue-integer[i];
        }
        System.out.println("the missing number is:"+sumValue);
    }
    //missing number using XOR Gate
//    public void xorLogic(){
//        Integer integer[]={9,6,4,2,3,5,7,0,1};
//        int allXOR=0;
//        for(int i=0; i<integer.length; i++){
//            allXOR=allXOR^i;
//        }
//        for(int num:integer){
//            allXOR=allXOR^num;
//        }
//        System.out.println("The missing number using XOR logic gate:" +allXOR);
//    }
    public List<Boolean> kidsWithGreatestNumberOfCandies(){
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> outputList=new ArrayList<>();
        int maximum=candies[0];
        for(int i=1; i<candies.length;i++){
            if(maximum<candies[i]){
                maximum=candies[i];
            }
        }
        for(int candy:candies){
            if(candy+extraCandies>=maximum){
                outputList.add(true);
            }else outputList.add(false);
        }return outputList;
    }
        public void maximumWealth(){
            int accounts[][] = {{1,2,3},{3,2,3}};
            int maximum=0;
            int rows=0;
            for(int i=0; i< accounts.length;i++){
                 rows=0;
                for(int j=0;j<accounts[i].length;j++){
                  rows+=accounts[i][j];
                }if(rows>maximum){
                    maximum=rows;
                }
            }
            System.out.println("The maximum wealth of a person is: "+maximum);


        }
}
