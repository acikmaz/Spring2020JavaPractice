package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the full name");
        String fullName = input.nextLine();

        System.out.println("Your full name is " + fullName);

        System.out.println("Enter your sentence");
        String sentence = input.nextLine();

        System.out.println("You have entered: " + sentence);




    }

}
