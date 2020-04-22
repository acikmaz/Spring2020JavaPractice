package day13_StringClass;

/*
        write a java program that can convert any given numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and switch statement
 */

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0-9");
        int num = input.nextByte();
        String word = "";

        switch (num) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "Invalid";
                break;
        }

        System.out.println(word);

        String result2 = (num == 0) ? "Zero" : (num == 1) ? "One" :(num == 2) ? "Two" :(num == 3)? "Three" :(num ==4) ? "Four"
                :(num == 5)? "Five" :(num == 6) ? "Six" :(num == 7) ? "Seven" :(num == 8)?"Eight":(num == 9)? "Nine" : "Invalid";

        System.out.println(result2);


    }
}
