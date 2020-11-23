package practice;

public class Car {

    public String make;
    public String model;
    public int numberOfDoors;
    public double topSpeed;
    public double price;

    public Car(String make, String model, int numberOfDoors, double topSpeed, double price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, double topSpeed, double price){
        this.make = make;
        this.model = model;
        numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(int numberOfDoors, double topSpeed, double price){
        make = "unknown";
        model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topSpeed = 90;
        price = 0;
    }

}


