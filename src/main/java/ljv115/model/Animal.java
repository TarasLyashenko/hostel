package ljv115.model;

public abstract class Animal
{
    public String name;
    public int age;

    public abstract void say();

    public abstract void eat();

    public void showAnimal()
    {
        say();
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        eat();
    }

}
