package ljv110.model;

public class WaterMonster extends Monster
{
    public int numberPlavnikov;

    public void eat()
    {
        System.out.println("Я ем утопленников используя :" + numberPlavnikov + " плавников.");

    }

    public void sleep()
    {
        System.out.println("I sleep at the bottom of the ocean");
    }

    public void walk()
    {
        System.out.println("I swim in troubled waters");
    }

    public void showMonster()
    {
        System.out.println("Hi my names " + name +
                ", my weight " + weight + "kg, i eat " + numberOfEaten + " People!");
        eat();
        walk();
        sleep();
    }
}
