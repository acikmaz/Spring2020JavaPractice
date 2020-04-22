package day07_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 400.5;

        boolean aMin = a < b && a < c ;
        boolean bMin = b < a && b < c ;
        boolean cMin = c < a && c < a ;

        if (aMin) {
            System.out.println(a + " is the minimum number");
        }

        if (bMin) {
            System.out.println(b + " is the minimum number");
        }

        if (cMin) {
            System.out.println(c + " is the minimum number");
        }




    }
}
