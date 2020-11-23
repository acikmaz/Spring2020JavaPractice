package day05_Unary_ShorthandOperators;

public class LeapYear {
    public static void main(String[] args) {

        short year = 2025;

       boolean leapYear = year % 4 == 0 ; //if year can be divided by 4 without any reminder, then it's leap year

        System.out.println(year + " is leap year: " + leapYear );


    }
}
