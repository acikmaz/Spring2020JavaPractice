package day15_forLoop;

import java.util.Scanner;

public class initials {
    /*
    	1. write a program that asks user's first and last name, then prints out the initials of the user
    Ex:
    input:
    cybertek
            batch12
    output:your initial is: CB
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first name:");
        String firstName = input.next();

        System.out.println("Enter last name:");
        String lastName = input.next();

        String initials = firstName.substring(0,1) + lastName.substring(0,1);

        // String initials = ""+ firstName.charAt(0) + lastName.charAt(0);
        // to convert char to string, need to add string

        initials = initials.toUpperCase();

        System.out.println(initials);

    }
}
