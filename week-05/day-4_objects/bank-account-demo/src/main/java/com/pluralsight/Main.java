package com.pluralsight;

import java.math.BigDecimal;

public class Main
{
    static void main()
    {
//        BigDecimal amount = new BigDecimal("1.25");
//
//        for (int i = 0; i < 100; i++)
//        {
//            amount = amount.add(new BigDecimal(".01"));
//            System.out.println("New Amount: " + amount);
//        }

        BigDecimal startingBalance = new BigDecimal("50000");
        BankAccount account = new BankAccount(123, "Jodici", startingBalance);

        BigDecimal startingBalance2 = new BigDecimal("50000");
        BankAccount account2 = new BankAccount(456, "Jacintha", startingBalance2);

        BankAccount.setInterestRate(new BigDecimal("0.02"));

        System.out.println("Jodici Starting balance: " + account.getBalance());
        System.out.println("Jodici Interest paid: " + account.payInterest());
        System.out.println("Jodici Balance after interest: " + account.getBalance());

        System.out.println();

        System.out.println("Jacintha Starting balance: " + account2.getBalance());
        System.out.println("Jacintha Interest paid: " + account2.payInterest());
        System.out.println("Jacintha Balance after interest: " + account2.getBalance());


    }
}
