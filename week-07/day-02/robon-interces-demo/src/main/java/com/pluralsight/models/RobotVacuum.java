package com.pluralsight.models;

public class RobotVacuum extends Robot implements Movable, Cleaner
{
    private boolean isCleaning = false;

    public RobotVacuum()
    {
        super("Vacuum");
    }

    public RobotVacuum(Point point)
    {
        super("Vacuum", point);
    }

    public void shutOff()
    {
        isCleaning = false;
        System.out.println("Vacuum stopped cleaning");
    }


    @Override
    public void clean()
    {
        isCleaning = true;
        System.out.println("Vacuum started cleaning");
    }

    @Override
    public void move(int x, int y)
    {
        super.move(x, y);
        if(isCleaning)
        {
            System.out.println("and is cleaning");
        }

    }

    @Override
    public void move(Point p)
    {
        super.move(p);

        if(isCleaning)
        {
            System.out.println("and is cleaning");
        }
    }

    @Override
    public void goHome()
    {
        super.goHome();

        if(isCleaning)
        {
            System.out.println("and is cleaning");
        }
        System.out.println("And then will rest");
    }
}
