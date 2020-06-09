package day48_Abstraction;

public interface Interface2 {

    int a = 100;

 //   public interface2() {  }

 //  public void method(){ }

 //  { }

    public static void main(String[] args) {
        System.out.println(a); // by default static

       // a = 200; //by default final


        System.out.println(Interface2.a);
        Interface2.method4();
    }

    public static void method4(){

    }

    void method5();

    public default void method6(){

    }

}
