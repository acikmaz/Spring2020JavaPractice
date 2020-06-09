package day48_Abstraction;

public class phoneObjects {

    public static void main(String[] args) {
        iPhone iPhone1 = new iPhone("X", 1000, "10 inches");
        iPhone iPhone2 = new iPhone("8", 900, "9 inches");

        System.out.println(iPhone1);
        System.out.println(iPhone2);

        iPhone1.faceTiming(319855375);
        iPhone1.calling(911);
        iPhone1.texting(3245687);

        System.out.println("===========================");

        Samsung samsung1 = new Samsung("S5", 800, "11 inches");

        System.out.println(samsung1);

        samsung1.freezing();
        samsung1.calling(911);
        samsung1.texting(877);

    }
}
