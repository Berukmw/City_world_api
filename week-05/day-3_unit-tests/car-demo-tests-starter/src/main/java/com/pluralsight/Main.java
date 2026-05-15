package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main()
    {
        Car car = new Car("Ford","F350");

        car.accelerate(20);

        System.out.println(car.getModel() + " is going " + car.getSpeed() + " mph");


    }
}
