package day48_Abstraction;

abstract class T {
    public void method2(){

    }
}

public interface defaultMethod {

    default void method(){
        System.out.println("Default method");
    }

    public static void main(String[] args) { }
}

class N implements defaultMethod{
    public static void main(String[] args) {
        N obj = new N();
        obj.method();
    }
}