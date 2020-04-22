package day17_whileLoops;

public class WhileLoopPractice3 {
    public static void main(String[] args) {

        /*
        for (int i = 1; i < 101; i++){
            System.out.print("*");
        }
         */
    int i = 0;
    while (i < 101){
        System.out.print("*");
        i++;
    }

        System.out.println();


    int number = 3;
    /*
    xxx
    x x
    x x
    x x
    xxx
     */

        System.out.println("xxxxx");
    while (number > 0){
        System.out.println("x   x");
        number--;
    }
        System.out.println("xxxxx");

    }
}
