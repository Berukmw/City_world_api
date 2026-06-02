package com.pluralsight;

import com.pluralsight.exercises.Exercise03Metals;

public class MetalsDemo
{
    static void main()
    {
        Exercise03Metals exercises = new Exercise03Metals();

        var summaries = exercises.getMetalSummaries();

        summaries.forEach(m -> {
            System.out.println(m.getName());
        });
    }
}
