package ljv84.service;

import java.util.Random;

public class RandomFight
{
    String weaponPlayerOne = "Меч";
    String weaponPlayerTwo = "Кинжал";
    Random random = new Random();
    FighterService fighterService = new FighterService();

    public void whoHitsFirst() throws InterruptedException
    {
        System.out.println("Сейчас бросок кубика решит кто ходит первый! От 1 - 5 Первый игрок, от 5 - 10 Второй!\n" +
                "Бросаю магический кубик...\n");
        Thread.sleep(4000);
        int whoHits = random.nextInt(10);
        System.out.println("Выпало число: " + whoHits);
        if (whoHits == 1 || whoHits == 2 || whoHits == 3 || whoHits == 4 || whoHits == 5)
        {
            System.out.println("Бьет первый игрок!");
        }
        if (whoHits == 6 || whoHits == 7 || whoHits == 8 || whoHits == 9 || whoHits == 10)
        {
            System.out.println("Бьет второй игрок!");
        }
    }

    public void randomHits()
    {
        int hits = random.nextInt(10);
        if (hits == 1 || hits == 2 || hits == 3 || hits == 4 || hits == 5) ;
        System.out.println("Одним быстрым скачком ты подбегаешь");
        System.out.println("Твой" + weaponPlayerOne + " Пронзает его плоть");
        amountOfDamageWeapon();
    }

    public void amountOfDamageWeapon()
    {
        int amountinflictedHp = random.nextInt(50);
        System.out.println("Ты наносишь" + amountinflictedHp + "Урона!");
    }
}
