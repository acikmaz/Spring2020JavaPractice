package day13_StringClass;

// import java.lang.String; not necessary, all the class in "java.lang" package are imported automatically

public class StringLiterals {
    public static void main(String[] args) {

        String str1 = "Cat"; //string pool
        String str2 = new String ("Cat"); // java heap

        System.out.println(str1 + ":" + str2);
        System.out.println(str1 == str2);

        String str3 = "Cat"; //string pool

        System.out.println(str1 == str3);

        String str4 = new String ("Cat");
        System.out.println(str2 == str4); // two independent object, false

        String s1 = "java"; //String pool, immutable we cannot modify it

        s1 = "javascript"; // new object will be created in the memory

        System.out.println(s1);

        String s2 = "java"; // no new object will be created in the memory

        System.out.println(s1 == s2);
        //          javascript == java => false












    }
}
