package ljv128v2.model;

import ljv128v2.interfaces.Flyable;

public class Airplane implements Flyable
{
    @Override
    public void fly()
    {
        System.out.println("I can fly!");
    }
}
