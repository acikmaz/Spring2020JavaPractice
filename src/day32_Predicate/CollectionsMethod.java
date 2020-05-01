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


        System.out.println("==============================");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));

        Integer maxNum = Collections.max(numbers);

        numbers.removeAll(Arrays.asList(maxNum));
        System.out.println(numbers);

        int secondMax = Collections.max(numbers);

        System.out.println(secondMax);

        System.out.println("================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));

        Integer minNum = Collections.min(list2);

        list2.removeAll(Arrays.asList(minNum));
        System.out.println(list2);

        int secondMin = Collections.min(list2);
        System.out.println(secondMin);

        System.out.println("================================");

        ArrayList<Integer> list3 = new ArrayList<>();
                    list3.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list3);


        Collections.swap(list3, 0,4);

        System.out.println(list3);

        System.out.println("================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer"));

         /*
            names.set(0, "Irina");
            names.set(1, "Irina");
            names.set(5, "Irina");
         */

        Collections.replaceAll(names, "Omer", "Irina");
        System.out.println(names);



    }
}
