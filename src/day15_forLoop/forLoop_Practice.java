package day15_forLoop;

public class forLoop_Practice {
    public static void main(String[] args) {

        String resultOdd = "";

        for (int number= 1; number <= 100; number += 2){
           // System.out.print(number+ " ");
            resultOdd += number + " ";
        }

        System.out.println(resultOdd);

        String resultEven= "";

        for (int numberEven = 0; numberEven <= 100; numberEven +=2){
            resultEven += numberEven + " ";
        }

        System.out.println(resultEven);
    }
}
