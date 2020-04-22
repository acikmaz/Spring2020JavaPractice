package day10_Switch_Scanner;


import java.util.Scanner;


public class number_scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
            int num1 =  scan.nextInt();

        System.out.println("Enter your second number: ");
            int num2 = scan.nextInt();

        System.out.println("Enter your third number: ");
            int num3 = scan.nextInt();

           // boolean num1Max = num1 > num2 && num1 > num3;
           //  boolean num2Max = num2 > num1 && num2 > num3;

        int max = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;

        System.out.println("the max number is " + max);

        int min = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2 : num3;


        System.out.println("the min number is " + min);



    }
}
