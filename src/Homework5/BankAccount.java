package Homework5;

public class BankAccount {
    static String bankName = "SBI";
    int accountNo;
    String customerName;
    int balance;

    BankAccount(int acc, String name) {
        this.accountNo = acc;
        this.customerName = name;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, "Rahul");
        b.deposit(5000);

        System.out.println("Bank: " + bankName);
        System.out.println("Account No: " + b.accountNo);
        System.out.println("Customer: " + b.customerName);
        System.out.println("Balance: " + b.balance);
    }
}
