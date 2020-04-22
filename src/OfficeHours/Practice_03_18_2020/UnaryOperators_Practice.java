package OfficeHours.Practice_03_18_2020;

import java.util.function.DoubleToIntFunction;

public class UnaryOperators_Practice {
    public static void main(String[] args) {

       //post :
        int a = 20;

        System.out.println(a++);  // 20
        System.out.println(a); // 21

        int b = 30 ;

        int c = b--; // c ==> 30

        System.out.println(c); //30
        System.out.println(b); // 29

        int d = 40;

        int e = d++;

        System.out.println(d);
        System.out.println(e);

    // pre :

        int x = 200;

        System.out.println(x--);
        System.out.println(x);

        int z = 100;

            z = z++ + --z - z-- + ++z;
            // z = 100 + 100 - 100 + 100

        System.out.println(z);

        int u = 900;

        int r = - ++u + ++u + -u++;
         // r = - 901 + 902 + -902

        System.out.println(r);
        System.out.println(u);


    }



}
