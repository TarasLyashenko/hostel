package ljv112.model;

public class Cat extends Animal
{
    public int numberOfLive;
    public String tailColor;

    @Override
    public void say()
    {
        System.out.println("Мяу!");
    }
}
