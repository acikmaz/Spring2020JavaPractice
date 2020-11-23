package day17_whileLoops;

public class removeDuplicates {
    public static void main(String[] args) {
        //String str = "Java is fun, Java is cool";
        String str = "cybertek School is a great place to study".toLowerCase();
        String result = "";

        int count = 0;

        String word = "s".toLowerCase();

        while (str.contains(word)){
            count++;
            str = str.replaceFirst(word, "");
        }

        System.out.println(count);
        System.out.println(str);



    }
}
