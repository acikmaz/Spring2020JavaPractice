package day37_Constructors;

public class StudentsObject {

    public static void main(String[] args) {

        Student student1 = new Student("Marina", 20, 'F', "Cybertek");

        // student1.setInfo("Marina", 20, false, "Cybertek");

        System.out.println( student1 );

        Student student2 = new Student("Ali", 25, 'M', "UIOWA");

        System.out.println(student2);
    }
}