package com.liashenko.animalhotel;

public class Acter
{
    public int height;
    public int age;
    public int weight;
    public String alias;
    public String workExperience;
    public String career;

    public void searchCostume(String name)
    {
        System.out.println("Где сука этот костюм " + name);
    }

    public void eat(String name)
    {
        System.out.println("Пойдешь хавать? " + name);
    }


}
