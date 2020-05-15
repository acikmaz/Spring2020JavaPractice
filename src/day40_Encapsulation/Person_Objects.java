package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {

        Person person1 = new Person("Zarina");
        System.out.println(person1.name);
        // System.out.println(person1.SSN);

        person1.setSSN(14569852);
        System.out.println(person1.getSSN());

        // System.out.println(person1.ID);

        person1.setID(445566);
        System.out.println(person1.getID());


    }
}
