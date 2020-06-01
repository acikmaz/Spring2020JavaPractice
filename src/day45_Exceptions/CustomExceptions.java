package day45_Exceptions;

class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("It is break time, we should take break");
    }

    public BreakTimeException(String str){
        super(str);
    }

}


public class CustomExceptions {
    public static void main(String[] args) {
        boolean breakTime = true;

        if (breakTime){
            throw new BreakTimeException("Let's go to the mall");
         } else {
            System.out.println("Continue to the class");
        }

      //  throw new RuntimeException("It is break time, we should take break");

    }
}
