package org.proghax333.class_10sept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private String pin;

    public Account() {
        this.accountNumber = 0;
    }

    public Account(int accountNumber, String name, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPin() {
        return this.pin;
    }

    public synchronized boolean withdraw(double amount) {
        if(amount > balance || amount < 0) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public synchronized boolean deposit(double amount) {
        if(amount < 0) {
            return false;
        }

        balance += amount;
        return true;
    }
}

class Bank {
    private final List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account) {
        for(Account a : this.accounts) {
            if(a.getAccountNumber() == account.getAccountNumber()) {
                return false;
            }
        }

        this.accounts.add(account);
        return true;
    }

    public Account getAccountByAccountNumber(int accountNumber) {
        for(Account account : this.accounts) {
            if(account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();

        String option = "-";

        boolean isActive = true;

        while(isActive) {
            System.out.println("[Banking System]\n" +
                    "1. Create account\n" +
                    "2. Deposit\n" +
                    "3. Withdraw\n" +
                    "4. Check balance\n" +
                    "5. Exit\n");

            System.out.print("> ");
            option = scanner.nextLine().toLowerCase();

            if(option.equals("1")) {
                int accountNumber;
                String name, pin;

                System.out.println("Enter account number: ");
                accountNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter account holder name: ");
                name = scanner.nextLine();

                System.out.println("Enter new PIN: ");
                pin = scanner.nextLine();

                Account account = new Account(accountNumber, name, 0.0, pin);
                if(bank.addAccount(account)) {
                    System.out.println("Account added.");
                } else {
                    System.out.println("Could not add account.");
                }
            } else if(option.equals("2")) {
                System.out.println("Enter account number to deposit in: ");
                int accountNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                Account account = bank.getAccountByAccountNumber(accountNumber);

                if(account == null) {
                    System.out.println("Account not found.");
                    continue;
                }

                if(account.deposit(amount)) {
                    System.out.println("Deposited successfully.");
                } else {
                    System.out.println("Failed to deposit.");
                }
            } else if(option.equals("3")) {
                System.out.println("Enter account number to withdraw from: ");
                int accountNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter PIN: ");
                String pin = scanner.nextLine();

                Account account = bank.getAccountByAccountNumber(accountNumber);

                if(account == null) {
                    System.out.println("Account not found.");
                    continue;
                }

                if(account.getPin().equals(pin)) {
                    if(account.withdraw(amount)) {
                        System.out.println("Withdrawal successful.");
                        System.out.println("Current balance: " + account.getBalance());
                    } else {
                        System.out.println("Failed to withdraw.");
                    }
                } else {
                    System.out.println("Invalid PIN entered.");
                }
            } else if(option.equals("4")) {
                System.out.println("Enter account number to check balance of: ");
                int accountNumber = Integer.parseInt(scanner.nextLine());

                Account account = bank.getAccountByAccountNumber(accountNumber);

                if(account == null) {
                    System.out.println("Account not found.");
                    continue;
                }

                System.out.println("Enter PIN: ");
                String pin = scanner.nextLine();

                if(account.getPin().equals(pin)) {
                    System.out.println("Balance = " + account.getBalance() + "\n");
                } else {
                    System.out.println("Invalid PIN entered.");
                }
            } else if(option.equals("5")) {
                isActive = false;
            } else {
                System.out.println("Invalid option entered. Try again.\n");
            }
        }

        scanner.close();
    }
}
