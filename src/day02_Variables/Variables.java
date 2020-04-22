package day02_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.jvm.hotspot.types.JFloatField;
import sun.lwawt.macosx.CSystemTray;

public class Variables {
    public static void main(String[] args) {
        /*
        declare variables:
            DataType variableName = Data;
            byte < short < int < long < float < double    char  boolean
            integer                     floating-point          T-F
                                        rational numbers
                                        decimal numbers
         */

        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);


        //  byte num = 2.5 byte short int long they only accept integers numbers
        //  byte num1 = 130; exceeds the range of byte
        //  short num = 3.5;
        short num3 = 1000;
        //  short num4 = 40000; exceeds the range of short

        System.out.println(num3);
        System.out.println(12345); //by default compiler takes in as int primitive

        int n1 = 20000;
        int n2 = 1000000000;

        System.out.println(n2);

       // int n3 = 9999999999; //out of int range.
        // long n3 = 9999999999; //compiler by default takes is as int

        long n4 = 9999999999l; //forcefully telling the compiler that this is long data number.l or L either is OK

        System.out.println(n4);
        System.out.println(9999999999L);

        long n5 = 19;
        System.out.println(n5);

        // int num = 7L; // larger one cannot be assigned to smaller one

        short s1 = 10;

        // byte n1 = s1; // short is larger than byte

        int i1 = s1;

        // byte b2 == i1 // larger one cannot be assigned to smaller one

        System.out.println(3.5);

        double d1 = 3.5;

        // double: preferred by the compiler of the decimal number like int for natural numbers

        // float f1 = 4.5; double primitive is larger than float primitive, cannot assigned

        float f2 = 5.5f;
        System.out.println(f2);


        System.out.println("============================================");

        float pi = 3.14f;
        double p = 3.14;

        int a1 = 3000;

        double d2 = a1; // output: 3000.0

        System.out.println(d2);

        long l2 = 40;

        float f3 = l2;
        System.out.println(f3);

    }
}
