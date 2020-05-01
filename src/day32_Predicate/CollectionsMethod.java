package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        int max = Collections.max(list);

        System.out.println( max );

        int min = Collections.min(list);

        System.out.println(min);

        /*
        1. write a program that can return the second max number from ArrayList
                    Ex: {1,2,3,4,5,6,7,8,8}
                    output: 7
        2. write a program that can return the second min number from ArrayList
                    Ex: {1,1,2,3,4,5,6,7,8,8}
                    output: 2
         */

    }
}
