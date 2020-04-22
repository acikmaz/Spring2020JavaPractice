package day24_Methods;

import java.util.Arrays;

import Resources.Library;

public class Test {
    public static void main(String[] args) {
        String str = "Cybertek";

        String RevSTR = Library.Reverse(str);

        System.out.println(str.equalsIgnoreCase(RevSTR));

        int[] arr = {10000, 3000, 2000, 40000, 50000, 100000000};

        arr = Library.sortDesending(arr);

        Arrays.sort (arr);

        System.out.println(Arrays.toString(arr));

    }
}
