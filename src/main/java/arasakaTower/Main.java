package arasakaTower;

import arasakaTower.model.Human;
import arasakaTower.service.AttackService;
import arasakaTower.service.GenerateService;

import java.io.FileNotFoundException;
import java.util.Random;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        AttackService attackService = new AttackService();
        long time = System.currentTimeMillis();
        GenerateService generateService = new GenerateService();
        Human human1 = new Human(generateService.newHuman(), generateService.newArms(), generateService.newImplants());
        Human human2 = new Human(generateService.newHuman(), generateService.newArms(), generateService.newImplants());

        while (human1.getHp() > 0 && human2.getHp() > 0)
        {
            int init1 = getRandomValue(0, 100);
            int init2 = getRandomValue(0, 100);
            Human target = init1 > init2 ? human2 : human1;
            Human attacked = init1 > init2 ? human1 : human2;
            System.out.println(target.getName() + " находится под ударом\n");
            Thread.sleep(3000);

            int damage = attackService.attack();
            target.setHp(target.getHp() - damage);
            System.out.println("HP " + target.getName() + ": " + target.getHp());
            System.out.println();

            System.out.println("HP " + human1.getName() + ": " + human1.getHp());
            System.out.println("HP " + human2.getName() + ": " + human2.getHp());
            System.out.println();
            Thread.sleep(3000);
        }

        Human dead = human1.getHp() <= 0 ? human1 : human2;
        System.out.println(dead.getName() + " погиб за :");
        System.out.println((System.currentTimeMillis() - time) / 1000 + " Секунд");
    }

    public static int getRandomValue(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}

