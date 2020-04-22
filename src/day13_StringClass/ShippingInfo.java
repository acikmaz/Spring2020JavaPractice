package day13_StringClass;

/*
		2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter building number:");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter street address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter state name:");
        String stateName = scan.next();

        System.out.println("Enter zip code:");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter full name of the person");
        String fullName = scan.nextLine();

        String shipTo = "\t" + fullName + "\n\t\t\t" +
                        buildingNumber + " " + streetAddress + "\n\t\t\t" +
                        cityName + ", " + stateName + " " + zipCode;

        System.out.println("Ship to: " + shipTo);





    }
}
