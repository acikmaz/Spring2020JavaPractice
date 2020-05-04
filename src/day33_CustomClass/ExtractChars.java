package day33_CustomClass;

import java.util.ArrayList;

public class ExtractChars {
    /*
    3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
     4. write a program that can extract the special characters, digits and alphabets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
     */

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
                    char[] arr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (char each : arr){
            if (Character.isLetter(each)){
                letters.add(each);
            } else if (Character.isDigit(each)){
                digits.add(each);
            } else {
                specialChars.add(each);
            }

        }

        System.out.println(arr);
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);


    }
}
