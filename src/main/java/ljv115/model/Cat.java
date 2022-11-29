package ljv115.model;

public class Cat extends Animal
{
    @Override
    public void say()
    {
        System.out.println("Мяу мяу!");
    }

    @Override
    public void eat()
    {
        System.out.println("Я люблю есть рыбку!\n");
    }
}
