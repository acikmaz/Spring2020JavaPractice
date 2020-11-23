package practice;

import day17_whileLoops.FINRA;

public class al {

    public static void main(String[] args) {

        String result = FINRA(25);

        System.out.println(result);



    }

    public static String FINRA(int i){

        String result = "";




        if (i%3 == 0 && i%5 == 0){
            result = "FINRA";
        } else if(i%3 == 0){
            result = "FIN";
        } else if (i%5 == 0){
            result = "RA";
        } else {
            result = i+"";
        }

        return result;
    }
}
