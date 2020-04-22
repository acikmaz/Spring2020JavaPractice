package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class AverageNumber {
    /*
    	1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
     */
    public static void main(String[] args) {
        double[] arr1 = {1,2,2};
        int length = arr1.length;
        double sum = 0;

        for (int i = 0; i < length; i++){
            double eachNum = arr1[i];
            sum += eachNum;
        }

        System.out.println(sum);

        double average = sum/length;

        DecimalFormat DF = new DecimalFormat("0.00");

        System.out.println(average);

        System.out.println(DF.format(average));

        System.out.println("=============");




    }

}
