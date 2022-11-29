package lvj128.model;

import lvj128.interfaces.Eatable;
import lvj128.interfaces.Guardable;
import lvj128.interfaces.Walkable;

public class Dog implements Walkable, Eatable, Guardable
{
    @Override
    public void eat()
    {
        System.out.println("Вкусный корм, ном ном ном");
    }

    @Override
    public void guard()
    {
        System.out.println("Я буду кусать его!");
    }

    @Override
    public void walk()
    {
        System.out.println("Гуляю на поводке");
    }
}
