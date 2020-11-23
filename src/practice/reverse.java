package practice;

import java.lang.reflect.Array;

public class reverse {

    public static void main(String[] args) {

        String str = "Hadi beni cevir";
        String reverseStr = "";
        String[] words = str.split(" ");

        for (int i = words.length-1; i >= 0; i-- ){
            reverseStr += words[i] + " ";
        }
        System.out.println(reverseStr.trim());

        StringBuilder str2 = new StringBuilder(str);
        System.out.println(str2.append("ali"));

        str2.reverse();

        System.out.println(str2);

        str2.replace(0,3, "ali");

        System.out.println(str2);

        str2.insert(5, "1234");

        System.out.println(str2);

        str2.delete(3,5);

        System.out.println(str2);
    }
}
