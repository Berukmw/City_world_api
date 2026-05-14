package com.pluralsight.application;

import com.pluralsight.models.*;
import com.pluralsight.ui.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class OldMacdonald
{
    UserInterface userInterface = new UserInterface();

    private ArrayList<FarmAnimal> farmAnimals;

    public OldMacdonald()
    {
        farmAnimals = new ArrayList<>();

        // add all animals
        farmAnimals.add(new Cow());
        farmAnimals.add(new Chicken());
        farmAnimals.add(new Pig());

    }

    public void run()
    {
        userInterface.sayHello();

        while(true)
        {
            int choice = userInterface.getHomeScreenChoice();

            if(choice == 1)
            {
                singSong();
            }
            else
            {
                userInterface.sayGoodbye();
                System.exit(0);
            }
        }
    }

    private void singSong()
    {
        userInterface.singSongIntro();

        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        Pig pig = new Pig();

        userInterface.singVerse(cow.getName(), cow.getSound());
        userInterface.singVerse(chicken.getName(), chicken.getSound());
        userInterface.singVerse(pig.getName(), pig.getSound());

    }


}
