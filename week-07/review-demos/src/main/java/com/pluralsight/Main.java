package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    static void main()
    {
//        arraysDemo();
        arrayListDemo();
    }

    public static void arrayListDemo()
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(getNumberFromUser());
        numbers.add(getNumberFromUser());
        numbers.add(getNumberFromUser());
        numbers.set(1, getNumberFromUser());

        for(int i = 0; i < numbers.size(); i++)
        {
            int number =  numbers.get(i);
            System.out.println(number);
        }
    }

    public static void arraysDemo()
    {
        int[] numbers = new int[2];

        numbers[0] = getNumberFromUser();
        numbers[1] = getNumberFromUser();

        int[] temp = new int[numbers.length * 2];
        for (int i = 0; i < numbers.length; i++)
        {
            temp[i] = numbers[i];
        }

        numbers = temp;

        numbers[2] = getNumberFromUser();

        // before I can add to index one I have to shift all other elements
        numbers[3] = numbers[2];
        numbers[2] = numbers[1];

        numbers[1] = getNumberFromUser();


        for (int number : numbers)
        {
            System.out.println(number);
        }

    }



    public static int getNumberFromUser()
    {
        System.out.print("Enter a number: ");
        String input = scanner.nextLine().trim();
        return Integer.parseInt(input);
    }
}
