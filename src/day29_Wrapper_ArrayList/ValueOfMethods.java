package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {

    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);

        System.out.println(a);

        double b = Integer.valueOf(str);
        // double = Integer

        System.out.println(b);

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
            //  double = double // none
        double d2 = Double.valueOf(str2); //15.5
            // double  = Double // Unboxing


        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1 == d2);

        System.out.println("============================");

        int z1 = 2000;
        // Long L1 = z1;  // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1;


      /*
      "True"
      "FAlSe" ==> to boolean
      "1000000000.5" ==> to float
      "123456"  ==> to short
       */

        String r1 = "true";
        boolean t1 = Boolean.valueOf(r1); //Boolean, true
                    // Boolean = Boolean // none

        boolean t2 = Boolean.valueOf(r1); // Boolean, true
        // boolean = Boolean // Unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("===================================");

        int maxNum = Integer.MAX_VALUE;

        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;

        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE;

        System.out.println(minNum);

        double minNum2 = Double.MIN_VALUE;

        System.out.println(minNum2);

        byte maxNum3 = Byte.MAX_VALUE;
        byte minNum3 = Byte.MIN_VALUE;

        System.out.println(maxNum3);
        System.out.println(minNum3);

        System.out.println("===================================");

        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));

        double[] arr2 = new double[3];
        System.out.println(Arrays.toString(arr2));

        boolean[] arr3 = new boolean[3];
        System.out.println(Arrays.toString(arr3));

        Character[]  arr4 = new Character[3];
        System.out.println(Arrays.toString(arr4));

        Integer[] arr5 = new Integer[3];
        System.out.println(Arrays.toString(arr5));




    }


}
