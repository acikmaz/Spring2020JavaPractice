package day14_StringClass;

/*
        valid credentials are:
            username: cybertek
            password: cybertekschool
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUserName = input.nextLine();

        System.out.println("Enter password");
        String inputPassword = input.nextLine();

        boolean loggedIn = inputUserName.equals("Cybertek") && inputPassword.equals("Cybertekschool");
        boolean InvalidUserName = ! inputUserName.equals("Cybertek") && inputPassword.equals("cybertekschool");
        boolean InvalidPassword = inputUserName.equals("Cybertek") && ! inputPassword.equals("cybertekschool");

        if ( !inputUserName.isEmpty() && !inputPassword.isEmpty() ) {
            if ( loggedIn ){
                System.out.println("Logged in");
            } else if (InvalidUserName) {
                System.out.println("Password is correct, username is incorrect");
            } else if (InvalidPassword) {
                System.out.println("Username is correct, password is incorrect");
            } else {
                System.out.println("Both username and password are incorrect");
            }
        } else {
            System.out.println("please enter the credentials!");
        }

    }

}
