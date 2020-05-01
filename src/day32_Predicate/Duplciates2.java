package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplciates2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));

            if (count > 1 && !result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }

        System.out.println(result);

        System.out.println("============================================");

        ArrayList<String> result2 = new ArrayList<>();
        for (String each : list) {
            int count = Collections.frequency(list, each);

            if (count > 1 && !result2.contains(each)) {
                result2.add(each);
            }
        }

        System.out.println(result2);

    }
}
