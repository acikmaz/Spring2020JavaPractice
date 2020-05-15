package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj1 = new AccessModifiers();

        // System.out.println(obj1.defaultAccess); //default: only accessible with in the same package

        System.out.println(obj1.publicAccess);

        // System.out.println(obj1.SSN); // private: only accessible within th same class


    }

}
