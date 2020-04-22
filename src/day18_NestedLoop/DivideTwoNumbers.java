package day18_NestedLoop;

public class DivideTwoNumbers {
    /*
    write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
     */

    public static void main(String[] args) {
     int a = 16;
     int b = 0;

     if (b == 0){
         System.out.println("b cannot be zero");
         System.exit(0);
     }

     int count = 0;

     while (a >= b){
         a -= b;
         count++;
     }

     if(a == 0) {
         System.out.println(count);
     } else {
         System.out.println(count +" reamainder: "+a);
     }


    }
}
