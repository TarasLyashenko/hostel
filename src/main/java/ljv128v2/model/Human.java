package ljv128v2.model;

import ljv128v2.interfaces.Flyable;
import ljv128v2.interfaces.Swimable;

public class Human implements Flyable, Swimable
{
    @Override
    public void fly()
    {
        System.out.println("I can fly an airplane");
    }

    @Override
    public void swim()
    {
        System.out.println("Yes, i can swim too!");
    }
}
