package practice;

public class loopsPractice {

    public static void main(String[] args) {

        int[] cols = {1,2,3,4};
        int[] rows = {1,2,3,4,5};
        for (int col : cols){
            for(int row : rows){
                System.out.print(" | Column" + col + " Rows" + row);
            }
            System.out.println();
        }

    }

}
