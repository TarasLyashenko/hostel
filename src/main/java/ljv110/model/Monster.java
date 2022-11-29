package ljv110.model;

import ljv110.model.Animal;

public class Monster extends Animal
{
    public int numberOfEaten;

    public void eat()
    {
        System.out.println("Я покушал человечинки");
    }

    public void sleep()
    {
        System.out.println("I never sleep");
    }

    public void walk()
    {
        System.out.println("I walk in the shadows at night");
    }

    public void showName()
    {
        System.out.println("My names " + name);
    }

    public void showWeight()
    {
        System.out.println("My weight: " + weight);
    }

    public void showNumberEating()
    {
        System.out.println("I Eat " + numberOfEaten + " People!");
    }
}
