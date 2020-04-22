package day07_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b && a > c ;
        boolean bGreater = b > a && b > c ;
        boolean cGreater = c > a && c > a ;

        if (aGreater) {
            System.out.println(a + " is greater number");
        }

        if (bGreater) {
            System.out.println(b + " is greater number");
        }

        if (cGreater) {
            System.out.println(c + " is greater number");
        }



    }

}
