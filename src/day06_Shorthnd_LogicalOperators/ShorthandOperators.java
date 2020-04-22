package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int x = 20;
            x += 10; //x = x+ 10 = 30

        System.out.println( x ); // x is now 30

            x += 60;  // x = x + 60
        System.out.println( x ); // new x is 90

        String schoolName = "CyberTek";

                schoolName += 12345; // schoolname = schoolname + 12345 // concatenation if there is text
        System.out.println(schoolName);

        System.out.println( 'a' + 'b'); // 97 + 98 ==> 195  // addition

        char ch1 = 'a';
            ch1 += 'b';

            // char ch1 = 195;
        System.out.println(ch1); // Character

        int num = 'z'; // num = 122
            num += 'x'; // num = 122 + 120 ==> 242
        System.out.println(num); //adiition and gives number because num defined as "int"

        int A = 100;
            A -= 90;
        System.out.println(A);

        int B = 200;
            B -= A; //B = B- A

        System.out.println(B);

        int a = 2;
            a *= 3;

        System.out.println(a);

        int b = a *= 10;

        //b = a = a * 10 = 60

        System.out.println(b); //60
        System.out.println(a);  //60

        int a1 = 100; //200

        int b1 = (a1 *= 2 ) + ++a1;

        // b1 = 200 + 201
        // b1 + 401

        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2; // x1 = x1 + 20

                // x1 += 20; ==> 30

        System.out.println(y);

        int q = 20;
        int p = q *= 20 * 3;

        System.out.println(p);

        int num1 = 300;
            num1 /= 2; // num1 = num1 / 2
        System.out.println(num1);

        int num2 = 400;
            num2 /= 20 + 10; //num2 = num2 / 30 ==> 400 / 30
        System.out.println(num2);

        int num3 = 300;
            num3 %= 9 + 21; // shorthand operators applied at the end of calculation bof both sides
        System.out.println(num3);

        int n1 = 400;
            n1 %= 3 * 5 ; // n1 %= 15
                          // n1 = n1 % 15
                            // n1 = 400 % 15
                                // 26.6666
                                    // remainder = 400 - (15 * 26) = 10
        System.out.println(n1);












    }

}
