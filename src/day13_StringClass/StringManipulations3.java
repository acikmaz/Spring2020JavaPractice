package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str = "I like Java Programming John";

        int num1 =  str.indexOf("John");

        System.out.println(num1);

        String str2 = "Cybertek school is awesome";

        int firstS = str2.indexOf("s");

        System.out.println(firstS);

        int secondS= str2.indexOf("is")+1;

        System.out.println(secondS);

        int maxIndexNumber = "Cybertek".length() - 1 ; // 8 - 1
        System.out.println(maxIndexNumber);

        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy");
        System.out.println(a1);

        String fullname = "Kuzzat Altay";

        String firstname = fullname.substring(0, fullname.indexOf(" "));

        System.out.println(firstname);

        String lastname = fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(lastname);









    }
}
