package ljv128v2.model;

import ljv128v2.interfaces.Flyable;

public class Bird implements Flyable
{
    @Override
    public void fly()
    {
        System.out.println("I can fly too!!");
    }
}
