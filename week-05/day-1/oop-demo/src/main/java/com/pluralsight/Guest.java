package com.pluralsight;

import java.time.LocalDate;

public class Guest
{
    // private variables
    // backing variables
    private String firstName;
    private String lastName;
    private int age;
    private String creditCardNumber;
    private LocalDate creditCardExpirationDate;
    private String creditCardCVV;
    private boolean isVerified;

    // constructor(s)
    public Guest(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){ return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge()    {
        return age;
    }
    public void setAge(int age)    {
        this.age = age;
    }

    public String getCreditCardNumber()    {
        return creditCardNumber;
    }
    public void setCreditCardNumber(String creditCardNumber)    {
        this.creditCardNumber = creditCardNumber;
    }

    public LocalDate getCreditCardExpirationDate()    {
        return creditCardExpirationDate;
    }
    public void setCreditCardExpirationDate(LocalDate creditCardExpirationDate)    {
        this.creditCardExpirationDate = creditCardExpirationDate;
    }

    public String getCreditCardCVV()    {
        return creditCardCVV;
    }
    public void setCreditCardCVV(String creditCardCVV)    {
        this.creditCardCVV = creditCardCVV;
    }

    public boolean isVerified()
    {
        return isVerified;
    }
    public void setVerified(boolean verified)
    {
        isVerified = verified;
    }

    // derived getter (derived property)
    public String getFullName()
    {
        // use existing backing variables to calculate the return
        return this.firstName + " " + this.lastName;
    }

    public boolean isAdult()
    {
        return age >= 18;
    }

}
