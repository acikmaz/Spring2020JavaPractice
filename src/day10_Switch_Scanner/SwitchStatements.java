package day10_Switch_Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        byte a = 4;
        float a1 = 4.5f;
        long a2 = 10l;
        double a3 = 2.5d;

        switch (a){
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("four");
                break;

            default:
                System.out.println("Invalid Case"); // default can be written anywhere in the switch command

        }
    }
}
