package ljvmy90;

import ljvmy90.model.Warrior;
import ljvmy90.service.GenerateService;

import java.util.Random;

public class Main
{


    public static void main(String[] args) throws Exception
    {
        long time = System.currentTimeMillis();
        GenerateService generateService = new GenerateService();

        Warrior warrior1 = new Warrior(generateService.generateRandomName(),
                generateService.generateRandomWeapon(), generateService.generateRandomSpell());
        Warrior warrior2 = new Warrior(generateService.generateRandomName(),
                generateService.generateRandomWeapon(), generateService.generateRandomSpell());

        while (warrior1.getHp() > 0 && warrior2.getHp() > 0)
        {
            int init1 = getRandomValue(0, 100);
            int init2 = getRandomValue(0, 100);
            Warrior target = init1 > init2 ? warrior2 : warrior1;
            Warrior attacked = init1 > init2 ? warrior1 : warrior2;
            System.out.println(target.getName() + " находится под ударом\n");
            Thread.sleep(3000);

            int damage = attacked.attack();
            target.setHp(target.getHp() - damage);
            System.out.println("HP " + target.getName() + ": " + target.getHp());
            System.out.println();

            System.out.println("HP " + warrior1.getName() + ": " + warrior1.getHp());
            System.out.println("HP " + warrior2.getName() + ": " + warrior2.getHp());
            System.out.println();
            Thread.sleep(3000);
        }

        Warrior dead = warrior1.getHp() <= 0 ? warrior1 : warrior2;
        System.out.println(dead.getName() + " погиб за :");
        System.out.println((System.currentTimeMillis() - time) / 1000 + " Секунд");
    }


    public static int getRandomValue(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
