package OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {




    public static int sum(int[ ] arr){
            int result = 0;
            for (int each : arr) {
                result += each;
            }

            return result;

        }

     public static int sum(ArrayList<Integer> list){
         int result = 0;
         for (int each : list) {
             result += each;
         }

         return result;
     }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // Integer[] arr2 = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,5));
       // list.addAll(Arrays.asList(arr2));


        System.out.println(sum(list));

        System.out.println(sum(arr));
    }
}

