package day44_Exceptions;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println("Java");
        waits(3);
        System.out.println("Cybertek");
    }

    public static void waits (int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e){ }

    }

}
