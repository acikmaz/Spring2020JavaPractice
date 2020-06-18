package day50_Polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog obj1 = new Dog("Lucy", "Female", 5);
        System.out.println(obj1.dogName);
        obj1.bark();

        Animal obj2 = new Dog("Kido", "Female", 6);
        // System.out.println(obj2.dogName);
        // obj2.bark();
        obj2.eat();
        obj2.methodA();

        Animal animal1 = new Cat("A", "F", 1);

        boolean isDog = animal1 instanceof Cat;
        System.out.println(isDog);

        Dog d1 = new Dog("A", "f", 1);

        // boolean r1 = d1 instanceof Cat; //there is no IS A relationship

        Animal animal2 = new Cat("Q", "F", 2);
        boolean r2 = animal2 instanceof Dog;

        System.out.println(r2);
    }
}
