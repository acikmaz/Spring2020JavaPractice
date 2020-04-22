package day05_Unary_ShorthandOperators;

public class Divisibility {

    public static void main(String[] args) {

        int number = 65;

        boolean divisibleBy2 = number % 2 == 0;

        boolean divisibleBy3 = number % 3 == 0;

        boolean divisibleBy5 = number % 5 == 0;

        String results1 = number + " is divisible by 2: " + divisibleBy2 ; // concatenation

        String results2 = number + " is divisible by 3: " + divisibleBy3 ;

        String results3 = number + " is divisible by 5: " + divisibleBy5 ;

        String finalResults = results1 + "\n" + results2 + "\n" + results3;

        System.out.println(finalResults);


        //  System.out.println(results1 + "\n" + results2 + "\n" + results3);

        /*

        System.out.println(number + " is divisible by 2: " + divisibleBy2 ); //concatenation

        System.out.println(number + " is divisible by 3: " + divisibleBy3 );

        System.out.println(number + " is divisible by 5: " + divisibleBy5 );
        */


    }
}
