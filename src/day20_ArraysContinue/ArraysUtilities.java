package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        String r = Arrays.toString(arr);

        System.out.println(r); // arrays must be converted to string before get printed

        String names[] = {"Ali", "Seda", "Rana", "Bera"};

        System.out.println(Arrays.toString(names));

        double[] nums = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]+1);



    }

}
