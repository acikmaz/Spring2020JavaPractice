package day17_whileLoops;

import java.util.Scanner;

public class Credentials {
    /*
    user: cybertek
    pass: cybertek123
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter User Name");
        String username = input.next();

        System.out.println("Enter Password");
        String password = input.next();

        boolean valid = username.equals("cybertek") && password.equals("cybertek123");

        int count =1;

        while (!valid){
            System.out.println("Please re-enter your credentials");

            System.out.println("Enter User Name");
            username = input.next();

            System.out.println("Enter Password");
            password = input.next();

           valid = username.equals("cybertek") && password.equals("cybertek123");
                    // validating new username and password

            count++;
            if (count == 3 && !valid) {
                System.out.println("Your account is locked");
                break;
            }


        }

        if (valid){
            System.out.println("Logged in");
        }

    }

}
