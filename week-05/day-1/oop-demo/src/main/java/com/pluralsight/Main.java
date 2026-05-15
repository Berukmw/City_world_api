package com.pluralsight;

public class Main
{
    static void main()
    {
        HotelApplication hotel = new HotelApplication();
//        hotel.start();

        Guest ariel = new Guest("Ariel", "Raymundo", 27);

        System.out.println(ariel.getFullName());

    }
}
