package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {

        boolean coldWeather = true;

        if(coldWeather) {
            //true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");

        }

        boolean coronaDetected = true;

        if(coronaDetected){

            System.out.println("buy more toilet papers");
            System.out.println("buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");

        }

        System.out.println("======================================================");
        System.out.println();

        int a = 201;

        boolean evenNumber = a % 2 == 0;

        if (evenNumber){
            System.out.println(a + " is an even number" );

        }

        /*
        boolean oddNumber = a % 2 != 0;


        if (oddNumber) {
            System.out.println(a + " is an odd number");
        }
        */


        if (!evenNumber) { //opposite of the evenNumber
            System.out.println(a + " is an odd number");
        }

        // "if" codes only get executed if the condition is true






    }
}
