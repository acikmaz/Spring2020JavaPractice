package day10_Switch_Scanner;

public class localVariables {
    public static void main(String[] args) {

        //declare a variable: DataType variableName = value;
        int a = 0;

        if(true) {
            System.out.println(a);
            int b = 10;
        }
            // local variables cannot be used outside its block

            switch (3){

                case 1:
                    int c = 100;
                    break;

                case 2:
                    //System.out.println(c); // the local var c belongs to the case block 1
            }





    }
}
