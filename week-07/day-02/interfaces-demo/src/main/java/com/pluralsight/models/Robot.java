package com.pluralsight.models;

public class Robot implements Movable
{
    private String name;
    private Point home;
    private Point currentLocation;

    public Robot(String name)
    {
        this(name, new Point(0,0));
    }

    public Robot(String name, Point home)
    {
        this.name = name;
        this.home = home;
        this.currentLocation = home;
    }

    public String getName()
    {
        return name;
    }

    public Point getHome()
    {
        return home;
    }

    public Point getCurrentLocation()
    {
        return currentLocation;
    }


    @Override
    public void move(int x, int y)
    {
        this.currentLocation = new Point(x, y);
        System.out.println(name + " moving to " + currentLocation.toString() );
    }

    @Override
    public void move(Point p)
    {
        this.currentLocation = p;
        System.out.println(name + " moving to " + currentLocation.toString() );
    }

    @Override
    public void goHome()
    {
        this.currentLocation = this.home;
        System.out.println(name + " is going home to " + currentLocation.toString() );
    }
}
