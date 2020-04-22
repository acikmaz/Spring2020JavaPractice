package day20_ArraysContinue;

public class Max_Min {
    /*
        1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T COVERED IN THE
     */
    public static void main(String[] args) {

        int[] arr = {10, 6 , 3, 1 , 200, 1000};
        int lastIndex = arr.length-1;
        int max = arr[0];
        int min = arr [0];

        for (int i = 0; i <= lastIndex; i++){

            if (arr[i] > max){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }

        }

        System.out.println(max);

        System.out.println(min);


    }
}
