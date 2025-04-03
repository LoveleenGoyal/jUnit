package com.bridgelabz.advancedJUnit;

public class BankAccount {
    double balance;
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. Withdrawal failed.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
