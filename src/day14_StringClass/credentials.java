package day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        String ValidUserName = "cybertek";

        String ValidPassword = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUserName = input.next();

        System.out.println("Enter password");
        String inputPassword = input.next();

        boolean validCredentials = inputUserName.equals(ValidUserName) && inputPassword.equals(ValidPassword);

        if(validCredentials){
            System.out.println("Log in successfully");
        } else {
            System.out.println("Invalid credentials");
        }


    }
}
