package day36_StaticBlock;

public class CapitalOne {

    public static void main(String[] args) {

        System.out.println(HumanResources.dev1);

        HumanResources.dev1.setInfo("Ali", "SDET", 120000,123478);

        System.out.println(HumanResources.dev1); // new values can be assigned while it is still in the static




    }

}
