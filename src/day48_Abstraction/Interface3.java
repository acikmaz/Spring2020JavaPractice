package day48_Abstraction;

public interface Interface3 {

    public abstract void method1();

    public abstract void method2();

    static final int num = 100; //by default public
    int num2 = 300; //by default public static final

    public static void main(String[] args) {
        Interface3.method3(); //static method can be called by its name
        System.out.println(num2); // in abstract class we cannot call a variable without static
    }

    public static void method3(){

    }

}
