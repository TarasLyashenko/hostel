package ljv115.model;

public class Dog extends Animal
{
    @Override
    public void say()
    {
        System.out.println("Гав гав!");
    }

    @Override
    public void eat()
    {
        System.out.println("Я люблю есть мясо!\n");
    }
}
