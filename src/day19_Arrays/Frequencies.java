package day19_Arrays;

public class Frequencies {
    /*
    	2. write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
     */

    public static void main(String[] args) {
        String str = "AABCC";

        String result = ""; // "A2B1C2"

        String nonDup = "";

        for (int i = 0; i <= str.length()-1; i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }

        //nonDup = "ABC",  str = "AABCC"

        for (int j = 0; j <= nonDup.length()-1; j ++){

            int count = 0;
            for (int i = 0; i <= str.length()-1; i++){
                if (str.charAt(j) == str.charAt(i)){
                    count++;
                }
            }

            result += nonDup.charAt(j) + "" +count;
        }

        System.out.println(result);





    }

}
