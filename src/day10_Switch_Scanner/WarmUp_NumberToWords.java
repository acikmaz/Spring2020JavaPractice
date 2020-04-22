package day10_Switch_Scanner;

/*
	3. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
 */

public class WarmUp_NumberToWords {
    public static void main(String[] args) {

        int num1 = 4;
        String NumberToWords = "";

        NumberToWords = (num1 == 0) ? "zero" : (num1 == 1) ? "one" : (num1 == 2) ? "two" : (num1 == 3) ? "three"
                : (num1 == 4) ? "four" : (num1 == 5) ? "five" : (num1 == 6) ? "six" : (num1 == 7) ? "seven"
                : (num1 == 8) ? "eighth" : (num1 == 9) ? "nine" : "invalid";

        System.out.println(NumberToWords);




    }
}
