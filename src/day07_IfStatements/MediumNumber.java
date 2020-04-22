package day07_IfStatements;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 300;
        double b = 400;
        double c = 400.5;

        boolean aMedium = ( a < b && a > c ) || ( a > b && a < c ) ;
        boolean bMedium = ( b < c && b > a ) || ( b > c && b < a ) ;
        boolean cMedium = ( c < a && c < b ) || ( c > b && c < a );

        if (aMedium) {
            System.out.println(a + " is the median number");
        }

        if (bMedium) {
            System.out.println(b + " is the median number");
        }

        if (cMedium) {
            System.out.println(c + " is the median number");
        }




    }
}
