package day12_javaRecap;

import java.util.Scanner;

/*
        ask the user enter salary
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
*/

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Salary");
        double salary = input.nextDouble();

        input.nextLine();

        System.out.println("Enter Full name");
        String fullName = input.nextLine();

        System.out.println("Enter Company Name");
        String companyName = input.nextLine();

        System.out.println("Enter SSS");
        int SSN = input.nextInt();

        input.nextLine();

        System.out.println("Enter JobTitle");
        String jobTitle = input.nextLine();

        System.out.println("Full name: " + fullName );
        System.out.println("Job title: " + jobTitle);
        System.out.println("Company name: " + companyName);
        System.out.println("SSN: " + SSN);
        System.out.println("Salary: $" + salary);

    }
}
