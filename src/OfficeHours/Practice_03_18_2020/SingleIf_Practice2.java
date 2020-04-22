package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice2 {
    public static void main(String[] args) {

        byte age = 20;

        boolean eligibilityToBuy = age > 21 || age == 21;

        if (eligibilityToBuy) {
            System.out.println("Here is your vodka");
        }

        if (!eligibilityToBuy) {
            System.out.println("Go drink your milk!");
        }

        System.out.println("++++++++++++++++++++++++++++");

        boolean feeling = false;

        if ( feeling == false) {
            System.out.println("don't be sad");
        }

        if ( feeling == true) {
            System.out.println("stay happy");

        }


    }
}
