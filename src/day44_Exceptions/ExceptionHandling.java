package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(100));
        } catch (Exception e){

            String description = e.getMessage();
            System.out.println(description);
        }

        System.out.println("===========================================");

        try {
            System.out.println(100 / 0);
            System.out.println("Try Block");
        } catch (RuntimeException e){
            System.out.println("Catch Block");
            String desc = e.getMessage();
            System.out.println(e.getMessage());
        }


        System.out.println("Completed");

    }
}
