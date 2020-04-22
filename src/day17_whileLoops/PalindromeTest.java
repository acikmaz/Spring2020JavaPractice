package day17_whileLoops;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "Anna";

        String reversestr = "";
        int index = str.length()-1;
        while (index >= 0){
            reversestr += str.charAt((index));
            index--;
        }
        boolean palindrome = reversestr.equalsIgnoreCase(str);

        System.out.println(palindrome);
    }
}
