package arasakaTower.service;

import arasakaTower.model.Arms;
import arasakaTower.model.CyberImplants;
import arasakaTower.model.Human;

import java.util.Random;

public class AttackService
{
    public int getRandomValue(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public int attack() throws Exception
    {
        Arms arms = new Arms();
        CyberImplants cyberImplants = new CyberImplants();
        Human human = new Human();
        int damageAttack = 0;
        Random random = new Random();
        int chanceAttackCyberImplnt = getRandomValue(1, 10);
        if (chanceAttackCyberImplnt <= 2 && human.getStrengthOfConsciousness() != 0)
        {
            System.out.println(human.getName() + " применяет " + cyberImplants.tittle
                    + "\n" + "\nНанесен урон: " + cyberImplants.damage);
            human.setStrengthOfConsciousness(human.getStrengthOfConsciousness() - cyberImplants.wastingNumberСonsciousness);
            Thread.sleep(7000);
            return cyberImplants.damage;
        }
        else
        {
            damageAttack = getRandomValue(arms.getMinDamage(), arms.getMaxDamage());
            System.out.print(arms.getName() + " ");
            System.out.print("" + arms.getName() + " - " + damageAttack + " Урона\n");

        }
        return damageAttack;
    }

}

