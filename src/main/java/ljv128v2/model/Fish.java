package ljv128v2.model;

import ljv128v2.interfaces.Swimable;

public class Fish implements Swimable
{
    @Override
    public void swim()
    {
        System.out.println("I can swim too!");
    }
}
