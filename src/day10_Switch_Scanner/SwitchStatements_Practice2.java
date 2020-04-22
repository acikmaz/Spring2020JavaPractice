package day10_Switch_Scanner;

public class SwitchStatements_Practice2 {
    public static void main(String[] args) {
        int num = 0;

        switch (1){
            case 1:
                num += 3;
                break;

            case 2:
                num += 2;
                break;

            case 3:
                num += 10;
                break;

            case 4:
                num -= 5;
                break;

            default:
                num = 0;


        }

        System.out.println(num);
    }
}
