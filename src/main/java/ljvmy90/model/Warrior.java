package ljvmy90.model;

import ljvmy90.service.GenerateService;

import java.util.Random;

public class Warrior
{
    GenerateService generateService = new GenerateService();
    private String name;
    private int hp = 100;
    private Weapon weapon;

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    private int mp = 50;
    private Spell spell;

    public int getHp()
    {
        return hp;
    }

    public int getMp()
    {
        return mp;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Weapon getWeapon()
    {
        return weapon;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public Spell getSpell()
    {
        return spell;
    }

    public void setSpell(Spell spell)
    {
        this.spell = spell;
    }

    public Warrior(String name, Weapon weapon, Spell spell)
    {
        this.name = name;
        this.weapon = weapon;
        this.spell = spell;
    }

    public int attack() throws Exception
    {
        int damageAttack = 0;
        Random random = new Random();
        int chanceCastSpell = getRandomValue(1, 10);
        if (chanceCastSpell <= 2 && mp >= spell.getAmountOfManaForSpell())
        {
            System.out.println(name + " применяет " + spell.getTittle()
                    + "\n" + spell.getCastDescription() + "\nНанесен урон: " + spell.getDamage());
            mp -= spell.getAmountOfManaForSpell();
            Thread.sleep(7000);
            return spell.getDamage();
        }
        else
        {
            int chanceMiss = getRandomValue(1, 10);
            if (chanceMiss <= 2)
            {
                System.out.print(name + " ");
                generateService.generateWayMiss();
                System.out.println();
            }
            else
            {
                damageAttack = getRandomValue(weapon.getMinDamage(), weapon.getMaxDamage());
                System.out.print(name + " ");
                generateService.generateWayToHit();
                System.out.print("" + weapon.getTittle() + " - " + damageAttack + " Урона\n");

            }

        }
        return damageAttack;
    }

    private int getRandomValue(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

