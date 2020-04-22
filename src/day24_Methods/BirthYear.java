package day24_Methods;



import java.util.Scanner;

public class BirthYear {

    public static void Age(int birthYear){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear = scan.nextInt();
        int age = currentYear - birthYear;
        if (age > 0 && birthYear > 1900) {
            System.out.println("Your age is " + age);
        } else{
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter birth year");
        int a = scan2.nextInt();
        Age( a );
    }




}
