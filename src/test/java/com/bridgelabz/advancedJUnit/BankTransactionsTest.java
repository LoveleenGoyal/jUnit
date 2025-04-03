package com.bridgelabz.advancedJUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTransactionsTest {
    BankAccount bankAccount;
    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount();
        bankAccount.balance = 1000.0;
    }
    @Test
    public void testDeposit() {
        bankAccount.deposit(100.0);
        assertEquals(1100.0, bankAccount.getBalance());
    }

    @Test
    public void testWithdrawal() {
        bankAccount.withdraw(1000.0);
        assertEquals(0.0, bankAccount.getBalance());
    }

    @Test
    public void testInsufficientBalance() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(1001.0));
    }
}
