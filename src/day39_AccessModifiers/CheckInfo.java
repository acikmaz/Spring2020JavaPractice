package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {
        System.out.println("Name: " + PersonalInfo.name);
        System.out.println("Gender: " + PersonalInfo.gender);

        System.out.println("Grade: " + PersonalInfo.grade);
        System.out.println("Age: " + PersonalInfo.age);

        // System.out.println("SSN: " + PersonalInfo.SSN); // private is only accessible within same class
        // System.out.println("ID: " + PersonalInfo.ID);

    }

}
