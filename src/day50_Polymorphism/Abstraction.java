package day50_Polymorphism;

interface I{

    void method2(); //public abstract by default
    abstract int method3();

    // public I(){}

    // public void m() { }

    // {    }
    // static { }

    int a = 1000; //by default pubic static and final

    public static void main(String[] args) {
        System.out.println(a);
        // a = 2000; // because final
    }
}

abstract class A {
    {

    }

    static {

    }

    protected abstract void method1();
    public void method4(){

    }

}


public class Abstraction extends A implements I{

    @Override
    public void method1(){

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    @Override
    public void method4() {
        super.method4();
    }
}


