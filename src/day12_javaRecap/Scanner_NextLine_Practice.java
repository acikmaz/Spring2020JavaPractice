package day12_javaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 57 Westside Dr, Iowa City IA, 52246

        System.out.println("Building Number");
        //int Bnumber = input.nextInt();
        String Bnumber = input.next();

        input.nextLine();

        System.out.println("Street");
        String street = input.nextLine();

        System.out.println("Enter the zip code");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();

        String fullAddress = Bnumber + " " + street + ", " + cityState + " " + zipCode;

        System.out.println(fullAddress);

        input.close(); //closes the scanner

    }
}
