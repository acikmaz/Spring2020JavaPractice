package day21_MultiDimensionalArrays;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class longestShortestWord {
    /*
    2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
     */
    public static void main(String[] args) {
        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "Alex"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String longestword = "";
        String shortestWord = "" ;

        for(int i = 0; i < names.length ; i++  ){

            if(names[i].length() > maxLengthString ){
                maxLengthString = names[i].length();
                longestword = names[i];
            }

            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }


        System.out.println(longestword);
        System.out.println(shortestWord);

    }
}
