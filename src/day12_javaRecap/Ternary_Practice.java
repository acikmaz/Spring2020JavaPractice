package day12_javaRecap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ternary_Practice {
    public static void main(String[] args) {
        /*
        200, ok
        201, created
        202, accepted
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter status code");

        int statusCode = scan.nextInt();

        String result = "";

        if (statusCode == 200) {
            result = "Ok";
        } else if (statusCode == 201) {
            result = "Created";
        } else if (statusCode == 202) {
            result = "Accepted";
        } else {
            result = "Invalid status code";
        }

        System.out.println(result);

        String result2 = (statusCode == 200) ? "OK" : (statusCode == 201) ? "Created" : (statusCode == 202) ? "Accepted" : "Invalid status Code";

        System.out.println(result2);


    }


}
