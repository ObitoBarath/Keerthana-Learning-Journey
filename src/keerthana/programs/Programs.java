package keerthana.programs;

public class Programs {




    public static  Integer helo(){
        String input = "asdfasdfasdf";


        try
        {
            char[] charArray = input.toCharArray();
            for (int i = 0; i < charArray.length; i++) {

                if (charArray[i] == 'f'){
                    return 10000;
                }

            }
            return 10;
        }catch (Exception e){
            System.out.println("e = " + e);
        }finally {
            System.out.println("Finally");
            return 99999;
        }

    }


    public static void main(String[] args) {
        System.out.println("output " + helo());
    }

    public static void decryptString(){
        String name ="a3b2c4d5";

        char[] value = name.toCharArray();

        String output ="";

        int count = 0;

        for(int i=0; i<value.length; i=i+2){

            char ch = value[i];

            count = Character.getNumericValue(value[i+1]);

            //System.out.println(count);

            for (int j=0; j<count ; j++){
                output = output + ch;
                //System.out.println(output);
            }

        }

        System.out.println(output);

    }
    public static void reverseString(){
        String name="Hello I am Palazzo";
        String redex = " ";
        String output="";
        String end="";
        String[] value = name.split(redex);
        //System.out.println(String(value));
        for (int i=0;i<value.length; i++){
            output=value[i];
            System.out.println(output);
            for ( int j= output.length()-1; j>=0; j--){
                end+=output.charAt(j);
            }
        }
        end+=" ";
        System.out.println(end);

    }



    public void encryptString(){
        String input = "aaacccd";
        String result = "";

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result += input.charAt(i - 1) + String.valueOf(count);
                count = 1;
            }
        }

        result += input.charAt(input.length() - 1) + String.valueOf(count);
        System.out.println("result = " + result);

    }
    public void isPalindrome(){
        String name = "madam";
        int s = name.length();
        String rev ="";
        //char[] value = name.toCharArray();
        for(int i=s-1; i>=0; i--){
            rev = rev + name.charAt(i);
//          System.out.println(rev+"letter");
        }
        if(name.equals(rev)){
//            System.out.println(name + " "+rev);
            System.out.println("palindrome");
        }
        else{
            System.out.println(name + " "+rev);
            System.out.println("not a palindrome");}
    }


}

