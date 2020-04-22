package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {

        int number = 100 ;

        if (number % 2 == 0) {
            System.out.println(number + " is even number ");
        } else {
            System.out.println(number + " is odd number");
        }


        System.out.println("================================");

        boolean evenNum = number % 2 == 0;

        if (evenNum) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

        System.out.println("================================");

        int age = 30;

        if (age >= 21) {
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }

        System.out.println("================================");


        boolean testedPositiveForCorona = true;

        if (testedPositiveForCorona) {
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Do more coding");
        }

        System.out.println("================================");







    }
}
