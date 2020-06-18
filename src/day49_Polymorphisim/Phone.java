package day49_Polymorphisim;
interface downloadable{
    boolean downloadable = true; //public static final
    void download(); // public abstract

}

interface AndroidApps extends downloadable { // 2 var 1 abstract method
    String AppStoreName = "Android";
}

interface AppleApps extends downloadable{  // 2 var 1 abstract method
    String AppStoreName = "Apple"; // public static final
}

public abstract class Phone {

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);

    public abstract void calling(long PhoneNumber);

    public String toString(){
        return "brand= " + brand + ", model= " + model + ", price= $" + price +", size=" + size ;
    }


}

/*
    1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
    2. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName

    3. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
    4. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
    5. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
    6. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances

 */