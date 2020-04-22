package day08_IfStatements;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {
        double Score = 75.9;
        boolean AGrade = Score <= 100 && Score >= 90 ;
        boolean BGrade = Score < 90   && Score >= 80 ;
        boolean CGrade = Score < 80   && Score >= 70 ;
        boolean DGrade = Score < 70   && Score >= 60 ;

        char Grade = ' ';

        // String Grade = " " ; if use string, it is required to change single quote to double quote

        if (AGrade) {
            Grade = 'A';

        } else if (BGrade){
                Grade = 'B';

        } else if (CGrade) {
            Grade = 'C';

        } else if (DGrade) {
            Grade = 'D';

        } else {
            Grade = 'F';
        }

        System.out.println("Score " + Score + " is: " + Grade);

    }
}
