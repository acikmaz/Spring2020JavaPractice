package day17_whileLoops;
/*
	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will need for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will need for loop and if statement
 */

import day07_IfStatements.MinNumber;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int MaxNumber = -1999999999;

        int MinNumber = 1999999999;

        for (int i = 1 ; i< 6; i++){
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > MaxNumber){
                MaxNumber = num;
            }

            if (num < MinNumber){
                MinNumber = num;
            }
        }

        System.out.println("Max: " + MaxNumber);
        System.out.println("Min: " + MinNumber);





    }
}
