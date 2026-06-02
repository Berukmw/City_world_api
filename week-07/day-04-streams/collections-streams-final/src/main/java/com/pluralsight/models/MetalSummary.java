package com.pluralsight.models;

public class MetalSummary
{
    private String name;
    private String symbol;
    private int atomicNumber;
    private String color;

    public MetalSummary()
    {
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }

    public int getAtomicNumber()
    {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber)
    {
        this.atomicNumber = atomicNumber;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
