package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a long number: ");

        long a = input.nextLong();

        System.out.println("You have entered: " + a);

        System.out.println("please enter a decimal");
        double b = input.nextFloat();

        System.out.println("You have entered: " + b);

        System.out.println("Enter a decimal number: ");
        double f = input.nextDouble();
        System.out.println("you have entered: " + f);

        System.out.println("Enter true or false");
        boolean bool = input.nextBoolean();

        System.out.println("you have entered: " + bool);

        System.out.println("Enter your sentence: ");
        String str = input.next();

        System.out.println("You have entered " + str);


    }

}
