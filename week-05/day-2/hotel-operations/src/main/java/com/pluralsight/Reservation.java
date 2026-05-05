package com.pluralsight;

public class Reservation
{
    // constants
    private final double KING_PRICE = 139.0;
    private final double DOUBLE_PRICE = 124.0;
    private final double WEEKEND_MULTIPLIER = 1.1;

    // private variables
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    // constructors
    public Reservation(String roomType, int numberOfNights, boolean isWeekend)
    {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    // properties (getters/setters)
    public String getRoomType()
    {
        return roomType;
    }
    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public int getNumberOfNights()
    {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights)
    {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend()
    {
        return isWeekend;
    }
    public void setWeekend(boolean weekend)
    {
        isWeekend = weekend;
    }

    // derived properties
    public double getPrice()
    {
        double price = (roomType.equalsIgnoreCase("king"))
                ? KING_PRICE
                : DOUBLE_PRICE;

        return (isWeekend)
                ? price * WEEKEND_MULTIPLIER
                : price;
    }

    public double getReservationTotal()
    {
        return numberOfNights * getPrice();
    }
}
