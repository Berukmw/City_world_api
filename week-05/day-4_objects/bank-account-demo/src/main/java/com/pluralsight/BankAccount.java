package com.pluralsight;

import java.math.BigDecimal;

public class BankAccount
{
    private int accountNumber;
    private String owner;
    private BigDecimal balance;

    static private BigDecimal interestRate;

    public BankAccount(int accountNumber, String owner, BigDecimal startingBalance)
    {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = startingBalance;
        this.interestRate = new BigDecimal("0.01");
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getOwner()
    {
        return owner;
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public static BigDecimal getInterestRate()
    {
        return interestRate;
    }

    public static void setInterestRate(BigDecimal interestRate)
    {
        BankAccount.interestRate = interestRate;
    }

    public BigDecimal deposit(BigDecimal amount)
    {
        balance =  balance.add(amount);
        return balance;
    }

    public BigDecimal withdraw(BigDecimal amount)
    {
        double currentBalance = balance.doubleValue();
        double withdrawAmount = amount.doubleValue();
        double newBalance = currentBalance - withdrawAmount;

        if(newBalance >= 0 )
        {
            balance = balance.subtract(amount);
        }

        return balance;
    }

    public BigDecimal payInterest()
    {
        BigDecimal interestAmount = balance.multiply(getInterestRate());

        deposit(interestAmount);

        return interestAmount;
    }
}
