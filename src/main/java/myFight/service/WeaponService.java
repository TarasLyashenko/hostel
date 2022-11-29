package myFight.service;

import java.util.*;

public class WeaponService
{
    Scanner scannerWeapon = new Scanner(System.in);
    RandomService randomService = new RandomService();
    public List<String> listWeapon = new ArrayList<>();

    public void addWeapon()
    {
        listWeapon.add("Меч,урон:40");
        listWeapon.add("Кинжал,урон:30");
        listWeapon.add("Посох,урон:20");
        listWeapon.add("Отравленный нож,урон:50");
        listWeapon.add("Магический лук,урон:55");
        listWeapon.add("Зачарованная палка...,урон:80");
    }

    public void generationRandomWeapon() throws InterruptedException
    {

        System.out.println("Открываю портал темной энергии и генерирую оружие\n" +
                "3\n");
        Thread.sleep(1000);
        System.out.println("2\n");
        Thread.sleep(1000);
        System.out.println("1\n");
        Thread.sleep(1000);
        System.out.println(randomService.getRandomValue(1, 6));
        System.out.println("Введите номер числа которое вам выпало");
        String numberChoice = scannerWeapon.nextLine();
        addWeapon();
        if (numberChoice.equals("1"))
        {
            System.out.println("Оружие из портала медленно опускается в вашу руку," +
                    " вы смотрите и это оказывается:");
            System.out.println(listWeapon.get(1));
            System.out.println("Запишите это оружие!");
        }
        if (numberChoice.equals("2"))
        {

            System.out.println("Оружие из портала медленно опускается в вашу руку," +
                    " вы смотрите и это оказывается:");
            System.out.println(listWeapon.get(2));
            System.out.println("Запишите это оружие!");
        }
        if (numberChoice.equals("3"))
        {
            System.out.println("Оружие из портала медленно опускается в вашу руку," +
                    " вы смотрите и это оказывается:");
            System.out.println(listWeapon.get(3));
            System.out.println("Запишите это оружие!");
        }
        if (numberChoice.equals("4"))
        {
            System.out.println("Оружие из портала медленно опускается в вашу руку," +
                    " вы смотрите и это оказывается:");
            System.out.println(listWeapon.get(4));
            System.out.println("Запишите это оружие!");
        }
        if (numberChoice.equals("5"))
        {
            System.out.println("Оружие из портала медленно опускается в вашу руку," +
                    " вы смотрите и это оказывается:");
            System.out.println(listWeapon.get(5));
            System.out.println("Запишите это оружие!");
        }
        if (numberChoice.equals("6"))
        {
            System.out.println("Оружие из портала медленно опускается в вашу руку," +
                    " вы смотрите и это оказывается:");
            System.out.println(listWeapon.get(6));
            System.out.println("Запишите это оружие!");
        }
    }
}
