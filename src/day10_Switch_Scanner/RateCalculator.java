package day10_Switch_Scanner;

import java.util.Scanner;

/*
 write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
 */

public class RateCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");

            int salary = scan.nextInt();

        System.out.println("How many hours do you work per week: ");

            byte weeklyHours = scan.nextByte();

        System.out.println("How many weeks do you work in a year: ");

            byte numberOfWeeks = scan.nextByte();

         int hourlyRate = salary / numberOfWeeks / weeklyHours;

        System.out.println("your hourly rate is: $" + hourlyRate);





    }



}
