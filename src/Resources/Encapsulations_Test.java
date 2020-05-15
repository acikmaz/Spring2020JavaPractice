package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulations_Test {

    public static void main(String[] args) {


        Encapsulation obj = new Encapsulation();

        // Encapsulation_Test obj2 = new Encapsulation_Test();
        // obj2.SSN = 1000;

        // System.out.println( obj.SSN );

        System.out.println(obj.getSSN()); // 0 because it is not set yet

        obj.setSSN(987654);

        System.out.println( obj.getSSN() );

    }

}
