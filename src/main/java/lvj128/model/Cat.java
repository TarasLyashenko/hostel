package lvj128.model;

import lvj128.interfaces.Eatable;
import lvj128.interfaces.Guardable;
import lvj128.interfaces.Walkable;

public class Cat implements Walkable, Guardable, Eatable
{
    @Override
    public void eat()
    {
        System.out.println("Ммм рыбка,вкусно!");
    }

    @Override
    public void guard()
    {
        System.out.println("Я буду бить его когтями!");
    }

    @Override
    public void walk()
    {
        System.out.println("Гуляю сама!");
    }
}
