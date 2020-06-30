package day53_Iterable_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Collection_Practice {
    /*
    access-modifiers specifier return-type methodsName(parameter)
    specifiers: static, final, abstract, synchronized
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list);

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set);

        System.out.println("======================");

        String[] arr = {"E", "B", "A", "D", "D", "C", "A"};  // EBADC
        LinkedHashSet<String> st = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(st);

        /*
        for(String each : arr){
        }
         */

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2 = new LinkedHashSet<>(arrayList);

        System.out.println(st2);

    }

    public synchronized void append(){

    }


}
