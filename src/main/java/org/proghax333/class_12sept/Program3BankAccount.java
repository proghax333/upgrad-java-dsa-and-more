package org.proghax333.class_12sept;

class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Program3BankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Setting balance to 1000.0");

        bankAccount.setBalance(1000.0);
        System.out.println("Balance: " + bankAccount.getBalance());
    }
}
