package day17_whileLoops;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {
        /*
            ask the user to enter yes or no.
                if the user enters other than yes or no, repeat the previous step
        */

        Scanner input = new Scanner((System.in));



        System.out.println("Enter Yes or No");
            String word = input.next();

            boolean valid  = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");

            while ( !valid ) {

                System.out.println("please re-enter");
                word = input.next();

                valid  = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");
               if (valid){
                // if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
                    break;
                } // can we use : if (valid) -when I tried it, it goes to infinite loop // this is different then the previous boolean




            }

            if(word.equalsIgnoreCase("Yes")){
                System.out.println("Entered yes");
            }

            if(word.equalsIgnoreCase("No")){
                System.out.println("Entered no");
            }
    }

}

