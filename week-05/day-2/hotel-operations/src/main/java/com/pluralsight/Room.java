package com.pluralsight;

public class Room
{
    // private backing variables
    private String roomType;
    private int numberOfBeds;
    private double price;
    private boolean isOccupied = false;
    private boolean isDirty = false;

    // constructors

    public Room(String roomType, int numberOfBeds, double price)
    {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public Room(String roomType, int numberOfBeds, double price, boolean isOccupied, boolean isDirty)
    {
        // if you want to call another constructor - this MUST BE THE FIRST LINE of code
        this(roomType, numberOfBeds, price);

        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    // properties (getters/setters)
    public String getRoomType()
    {
        return this.roomType;
    }

    public int getNumberOfBeds()
    {
        return numberOfBeds;
    }

    public double getPrice() { return price; }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public boolean isDirty()
    {
        return isDirty;
    }


    // derived getters
    public boolean isAvailable()
    {
        return !isOccupied && !isDirty;
    }

    // methods
    public void checkIn()
    {
        isOccupied = true;
        isDirty = true;
    }

    public void checkOut()
    {
        isOccupied = false;
        // if someone was in the room we want to make sure that it is tagged as dirty on checkout
        isDirty = true;
    }

    public void cleanRoom()
    {
        isDirty = false;
    }
}
