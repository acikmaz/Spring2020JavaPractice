package day19_Arrays;

import java.util.Scanner;

public class Uniques {
    /*

    1. write a program that can return the unique characters from a string
    Ex:  "AABCC" ==> "B"

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();
        String result = "";


        for (int j = 0; j <= str.length()-1; j++){

            int count = 0; //to count the occurrence of the character
            for (int i = 0; i <= str.length()-1; i++){ // burdaki loop da 1 harf icin butun harfleri check ediyor
                if (str.charAt(j) == str.charAt(i)){    // eger count 1 kaliyorsa asagida print ediyor
                    count++;                             // sonra loop bitiyor en dis halka loop da ikinci karaktere geciyor
                }                                          // sonra o bitiyor hepsini print ediyoruz
            }

            if (count == 1){
                result += str.charAt(j);
            }

        }

        System.out.println(result);



    }

}
