package com.pluralsight.models;

public interface Movable
{
    void move(int x, int y);
    void move(Point p);
    void goHome();
}
