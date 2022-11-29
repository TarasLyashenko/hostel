package myFight.service;

import java.util.*;

public class SpellService
{
    Scanner scannerSpell = new Scanner(System.in);
    RandomService randomService = new RandomService();
    public List<String> listSpell = new ArrayList<>();

    public void addSpell()
    {
        listSpell.add("Шар Огня,урон:50,Тратит маны:40");
        listSpell.add("Магическая стрела,урон:45,Тратит маны:30");
        listSpell.add("Кислотный плевок,урон:70,Тратит маны:55");
        listSpell.add("Удар молнии,урон:90,Тратит маны:70");
        listSpell.add("Метеоритный удар,урон:100,Тратит маны:100");
        listSpell.add("Лечение,хил на 30,Тратит маны:50");
    }

    public void generationRandomSpell() throws InterruptedException
    {

        System.out.println("Открываю портал темной энергии и генерирую заклинание\n" +
                "3\n");
        Thread.sleep(1000);
        System.out.println("2\n");
        Thread.sleep(1000);
        System.out.println("1\n");
        Thread.sleep(1000);
        System.out.println(randomService.getRandomValue(1, 6));
        System.out.println("Введите номер числа которое вам выпало");
        String numberChoice = scannerSpell.nextLine();
        addSpell();
        if (numberChoice.equals("1"))
        {
            System.out.println("Вы чувствуете новую обретенную силу и это оказывается:");
            System.out.println(listSpell.get(1));
            System.out.println("Запишите это Заклинание");
        }
        if (numberChoice.equals("2"))
        {

            System.out.println("Вы чувствуете новую обретенную силу и это оказывается:");
            System.out.println(listSpell.get(2));
            System.out.println("Запишите это Заклинание");
        }
        if (numberChoice.equals("3"))
        {
            System.out.println("Вы чувствуете новую обретенную силу и это оказывается:");
            System.out.println(listSpell.get(3));
            System.out.println("Запишите это Заклинание");
        }
        if (numberChoice.equals("4"))
        {
            System.out.println("Вы чувствуете новую обретенную силу и это оказывается:");
            System.out.println(listSpell.get(4));
            System.out.println("Запишите это Заклинание");
        }
        if (numberChoice.equals("5"))
        {
            System.out.println("Вы чувствуете новую обретенную силу и это оказывается:");
            System.out.println(listSpell.get(5));
            System.out.println("Запишите это Заклинание");
        }
        if (numberChoice.equals("6"))
        {
            System.out.println("Вы чувствуете новую обретенную силу и это оказывается:");
            System.out.println(listSpell.get(6));
            System.out.println("Запишите это Заклинание");
        }
    }
}

