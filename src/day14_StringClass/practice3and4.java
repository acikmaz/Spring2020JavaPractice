package day14_StringClass;

/*
3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
 */

import java.util.Scanner;

public class practice3and4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = input.next();

        int length1 = word1.length();

        if (word1.charAt(0) == word1.charAt(length1-1)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("===================");

        /*
        4. Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
         */

        System.out.println("Enter a word");
        String word2 = input.next();
        word2 = word2.toLowerCase();

        //int length2 = word2.length();

        // boolean result = (word2.charAt(length2-2) + "" + word2.charAt(length2-1)) == "ly";

       // boolean result = word2.substring(length2-2) == "ly";

        if (word2.endsWith("ly")){
            System.out.println("really?");
        } else {
            System.out.println("never mind");
        }









    }

}
