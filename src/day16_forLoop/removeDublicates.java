package day16_forLoop;

public class removeDublicates {
    public static void main(String[] args) {
        String str = "ababccddc";
                //    0123

        String result = "";

        for (int i = 0; i <= str.length()-1; i++){
        /*
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);

            }
         */

            if (result.contains("" + str.charAt(i))){
                continue;
            }
                result += str.charAt(i);


        }

        System.out.println(result);
    }
}
