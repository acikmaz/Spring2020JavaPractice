package day12_javaRecap;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(num);

        input.nextLine();

        System.out.println("Enter your name");
        String name = input.nextLine(); // enter

        System.out.println(name);





    }

}
