package day33_CustomClass;

public class BankAccount {
    /*
    practice task:
    create a custom class for bank account
    attributes: accountholder, accountnumber, balance
    actions: checkingBalance(), WithDraw(amount ), deposit (amount)
     */

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available Balance: " + balance);
    }

    public void withDraw(double amount){
        System.out.println("WithDrawing $" + amount);
        balance -= amount;
    }

    public  void deposit(double amount){
        System.out.println("depositing  $" + amount);
        balance += amount;
    }

    public String toString(){
        String result = "Account Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nAvailable Balance: " + balance;
        return result;
    }

}
