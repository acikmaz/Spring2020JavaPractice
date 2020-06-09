package day48_Abstraction;

interface I1 {
    void method1();

}

interface I2 extends I1 {
    void method2();

}

abstract class AC  implements I2 {
    abstract void method3();

}

public abstract class extends_implements extends  AC {
    @Override
    public void method2(){

    }

}

class testRun extends extends_implements {
    @Override
    public void method1() {
        
    }

    @Override
    void method3() {

    }
}