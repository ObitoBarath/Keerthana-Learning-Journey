package keerthana.programs;

public class Programs {

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


}
