package day50_Polymorphism;

public class Dog extends Animal{

    public String dogName;

    public Dog(String dogName,String gender, int age) {
        this.dogName = dogName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("Dog " + dogName +  " is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog " + dogName +  " is sleeping");
    }


    public void bark(){
        System.out.println("Dog " + dogName +  " is barking");
    }




}
