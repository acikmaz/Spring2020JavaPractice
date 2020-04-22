package day11_Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Your age is: " + age);

        input.nextLine(); // take out the enter

        System.out.println("enter you full name");
        String fullName = input.nextLine();

        System.out.println("your full name: " + fullName);




    }


}
