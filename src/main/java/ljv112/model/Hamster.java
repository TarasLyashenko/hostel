package ljv112.model;

public class Hamster extends Animal
{
    public int numberDeath;
    public String paintingColor;

    @Override
    public void say()
    {
        System.out.println("*звук хомяка*");
    }
}
