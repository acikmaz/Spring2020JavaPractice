package day18_NestedLoop;

public class Triangle {
    public static void main(String[] args) {

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
         */

        int z = 1;
        while (z <= 7){
            int i = 1;
            while (i <= z){

                System.out.print("* ");
                i++;
            }

            System.out.println();

            z++;
        }

        System.out.println("=============================");

        int k = 7;
        while (k >= 1){
            int i = 1;
            while (i <= k){

                System.out.print("* ");
                i++;
            }

            System.out.println();

            k--;
        }

    }
}
