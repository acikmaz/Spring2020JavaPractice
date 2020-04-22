package day11_Scanner;
/*
Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = input.next();

        System.out.println("Please enter your last name");
        String lastName = input.next();

        String fullName = firstName + lastName;

        System.out.println("Are you an employee or not?");

        Boolean employmentStatus = input.nextBoolean();

        double salary = 0;

        if (employmentStatus == true) {
            System.out.println("Enter your salary");
            salary = input.nextDouble();
        }


        System.out.println("Full name is: " + fullName);
        System.out.println("Employeed: " + employmentStatus);
        System.out.println(salary);


    }

}
