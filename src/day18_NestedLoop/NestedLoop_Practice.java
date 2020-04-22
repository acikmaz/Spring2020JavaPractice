package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue? yes/no");
            String answer = input.next();

            /*
            if ( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
                System.out.println("Invalid entry, please re-enter two word");
            }
             */

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry, please re-enter valid response: Do you want to continue? yes/no");
                answer = input.next();

            }

            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thank you for using the calculator");
                break;
            }
        }

        /*
        assignment:
        write a program for the room reservation:

                King Bed ==> 120$
                Queen Bed ==> 100$
                Single Bed ==> 80$

                    should ask which bedroom type do you want to reserve
                        if user provided invalid entry => please re-enter

                        calculate the total price

                     do you want to reserve another room:

                                if yes ==> repeat the previous steps
                                if no ==> your total price is: $$$

                                if answer either yes or no ==> please re-enter
         */

    }
}
