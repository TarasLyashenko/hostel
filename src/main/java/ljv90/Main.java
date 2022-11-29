package ljv90;

import ljv90.model.Warrior;

import java.util.Random;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Warrior warrior1 = new Warrior("Gelds");
        Warrior warrior2 = new Warrior("Hems");

        while (warrior1.hp > 0 && warrior2.hp > 0)
        {
            int init1 = getRandomValue(0, 100);
            int init2 = getRandomValue(0, 100);

            Warrior source = init1 < init2 ? warrior2 : warrior1;
            Warrior target = init1 > init2 ? warrior2 : warrior1; //Тернарный оператор
            System.out.println(target.name + " находится под ударом");
            Thread.sleep(3000);

            int damage = getRandomValue(1, 4);
            System.out.println("Получен урон: " + damage);
            target.hp = target.hp - damage;
            System.out.println("HP " + target.name + ": " + target.hp);
            System.out.println();

            System.out.println("HP " + warrior1.name + ": " + warrior1.hp);
            System.out.println("HP " + warrior2.name + ": " + warrior2.hp);
            Thread.sleep(3000);
        }

        Warrior dead = warrior1.hp <= 0 ? warrior1 : warrior2;
        System.out.println(dead.name + " погиб");
    }

    public static int getRandomValue(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
