package day12_javaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

               // String str = scan.next();

        // System.out.println(str);

        // 1545 Aber Ave, Iowa City IA, 52246
        String fullAddress = "";

        System.out.println("Enter the number of the building");
        short Bnumber = scan.nextShort();
            fullAddress += Bnumber + " ";

        System.out.println("Enter the Street Name");
        String streetName = scan.next();
            fullAddress += streetName + " ";

        System.out.println("Enter the road type");
        String roadType = scan.next();
            fullAddress += roadType + ", ";

        System.out.println("Enter the city name, state, zipcode");
        String CityName = scan.next();
        fullAddress += CityName + " ";

        String state = scan.next();
        fullAddress += state +", ";

        int zipCode = scan.nextInt();
        fullAddress += zipCode;

        System.out.println("Address is: " + fullAddress);



    }
}
