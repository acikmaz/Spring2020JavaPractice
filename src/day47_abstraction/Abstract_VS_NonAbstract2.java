package day47_abstraction;

abstract class A {
    public abstract void method1();
    public void method2(){ }

}

public class Abstract_VS_NonAbstract2 extends A { // MANDATORY to override abstract method of A

    @Override
    public void method1(){  }
}


abstract class B extends A{ //optional to override the abstract method of A
// one abstract & one instance methods

}

class C extends B {
    public void method1(){

    }
}