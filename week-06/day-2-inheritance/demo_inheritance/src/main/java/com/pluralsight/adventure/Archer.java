package com.pluralsight.adventure;

import javax.swing.plaf.metal.MetalButtonUI;

public class Archer extends Character
{
    private int arrows;

    public Archer(String name, int health, int level, int experience, int arrows)
    {
        super(name, health, level, experience, 3, 2);

        this.arrows = arrows;
    }

    // new methods that differentiate the archer from all other characters
    public void addArrow()
    {
        arrows++;
        System.out.println(getName() + " picked up an arrow and now has " + arrows + " arrows.");
    }

    @Override
    public void attack(Character target)
    {
        if(arrows <= 0)
        {
            System.out.println(getName() + " is out of arrows and cannot attack.");
            return;
        }

        super.attack(target);
    }

    @Override
    public void specialAbility()
    {
        System.out.println(this.getName() + " is an archer who attacks by shooting arrows with an attack multiplier of " + getAttackMultiplier() + ", and attacks from distance and has a defenseMultiplier of " + getDefenseMultiplier());
    }
}
