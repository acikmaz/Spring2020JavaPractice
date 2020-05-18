package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {
        BankAccount Ali = new BankAccount("Ali","Cikmaz");

        System.out.println(Ali.getAccountHolder());

        System.out.println(Ali.getBalance());

        Ali.checkBalance();
        Ali.depositing(20000);
        Ali.checkBalance();
        Ali.withdrawing(15000);
        Ali.checkBalance();

        System.out.println(Ali);

        Ali.withdrawing(5200);
        System.out.println(Ali);
        Ali.depositing(200000);
        System.out.println(Ali);




    }

}
