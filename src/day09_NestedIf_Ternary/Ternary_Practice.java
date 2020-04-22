package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
       int number = 0;
       char ch1 = ' ';


       if (number > 0){
           ch1 = '+';
       } else if (number < 0){
           ch1 = '-';
       } else {
           ch1 = '0';
       }

        System.out.println(ch1);

       char ch2 = (number > 0 ) ? '+' : (number < 0) ? '-' : '0';

        System.out.println(ch2);

        System.out.println("==========================");

        double Score = 90;
        boolean AGrade = Score <= 100 && Score >= 90 ;
        boolean BGrade = Score < 90   && Score >= 80 ;
        boolean CGrade = Score < 80   && Score >= 70 ;
        boolean DGrade = Score < 70   && Score >= 60 ;
        boolean FGrade = Score < 70   && Score >=  0 ;

        char Grade = (AGrade) ? 'A' : (BGrade) ? 'B' : (CGrade) ? 'C'
                : (DGrade) ? 'D' : (FGrade) ? 'F' : '?' ;

        String Grade2 = (AGrade) ? "A" : (BGrade) ? "B" : (CGrade) ? "C"
                : (DGrade) ? "D" : (FGrade) ? "F" : "Invalid Entry" ;

        System.out.println(Grade);
        System.out.println(Grade2);

        System.out.println("===========================");

        int num = 1234;
        if (num % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        //cannot be applied to ternary because there is no returning value




    }
}
