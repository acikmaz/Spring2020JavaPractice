package day18_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int j = 1; j <= 9; j++){

            for (int i = 1; i < j; i++) {
                System.out.print("* ");
            }
        System.out.println();
        }

        System.out.println("============================");

        for (int j = 9; j >= 0; j--){

            for (int i = 1; i < j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("==============================");
        /*
        a
        a b
        a b c
        a b c d
        a b c d e
         */

        for (char z = 'a' ; z <= 'z'; z++) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println("=====================================================");

        for (char k = 'z' ; k >= 'a'; k--) {
            for (char ch1 = 'a'; ch1 <= k; ch1++) {
                System.out.print(ch1 + " ");
            }
            System.out.println();
        }


    }
}
