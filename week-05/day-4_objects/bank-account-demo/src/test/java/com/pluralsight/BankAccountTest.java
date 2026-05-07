package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest
{

    BankAccount account;

    @BeforeEach
    public void setup()
    {
        BigDecimal initialBalance = new BigDecimal(100);
        account = new BankAccount(123, "Bryan", initialBalance);
    }

    @Test
    public void deposit_shouldIncreaseBalance_byDepositAmount()
    {
        // arrange
        BigDecimal depositAmount = new BigDecimal(150);
        BigDecimal expectedBalance = new BigDecimal(250);

        // act
        BigDecimal returnValue = account.deposit(depositAmount);

        // assert
        assertEquals(expectedBalance, account.getBalance(), "because I started with $100 and deposited $150");
        assertEquals(expectedBalance, returnValue, "because the returnValue should match the balance");

    }

    @Test
    public void withdraw_shouldDecreaseBalance_byWithdrawAmount()
    {
        // arrange
        BigDecimal withdrawAmount = new BigDecimal(50);
        BigDecimal expectedBalance = new BigDecimal(50);

        // act
        BigDecimal returnValue = account.withdraw(withdrawAmount);

        // assert
        assertEquals(expectedBalance, account.getBalance(), "because I started with $100 and withdrew $50");
        assertEquals(expectedBalance, returnValue, "because the return value should match the new balance");

    }


    @Test
    public void withdraw_shouldNotAllow_negativeBalance()
    {
        // arrange
        BigDecimal withdrawAmount = new BigDecimal(150);
        BigDecimal expectedBalance = new BigDecimal(100);

        // act
        BigDecimal returnValue = account.withdraw(withdrawAmount);

        // assert
        assertEquals(expectedBalance, account.getBalance(), "because I started with $100 and withdrew $50");
        assertEquals(expectedBalance, returnValue, "because the return value should match the new balance");

    }

}