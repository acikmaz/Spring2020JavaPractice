package day27_DateTime;

/*
 write a return method that can return the minimum number from an int array
 */

public class Find_Minimum {

    public static void main(String[] args) {
        int[] arr = {5,4,7,5};

        int minimum = arr[0];

        for (int each : arr ){
            if (each < minimum){
                minimum = each;
            }
        }

        System.out.println(minimum);


        int[] arr2 = {100,2000,3000,40,50,-100,-9000};

        System.out.println(minimum(arr2));
    }

    public static int minimum(int[] arr){
        int minimum = arr[0];

        for (int each : arr ) {
            if (each < minimum) {
                minimum = each;
            }
        }

        return minimum;
    }
}
