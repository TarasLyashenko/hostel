package myFight.service;

import myFight.model.Fighter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateFightersService
{
    SpellService spellService = new SpellService();
    WeaponService weaponService = new WeaponService();
    List<Fighter> fighters = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addNewFighters() throws InterruptedException
    {
        System.out.println("Добро пожаловать в создание персонажа," +
                "обращаем ваше внимание что от вашего выбора зависят ваши характеристики\n" +
                " Выберите рассу:\n" +
                "1 - Человек hp - 100,mana 100,ультимативная способность - Лечение\n" +
                "2 - Орк(hp - 150,mana 50, ультимативная способность - Берсерк\n" +
                "3 - Нежить(hp - 60,mana 150, ультимативная способность - Призыв нежити");
        String choiceRace = scanner.nextLine();
        if (choiceRace.equals("1"))
        {
            System.out.println("Введите свою рассу - Человек");
            String choiceYouRace = scanner.nextLine();
            System.out.println("Генерирую случайное оружие");
            weaponService.generationRandomWeapon();
            String choiseWeapon = scanner.nextLine();
            System.out.println("Запишите ваше здоровье - 100");
            String choiceHealth = scanner.nextLine();
            System.out.println("Запишите вашу ману - 100");
            String choiceMana = scanner.nextLine();
            System.out.println("Запишите вашу способность - Лечение");
            String choiceUltimate = scanner.nextLine();
            System.out.println("Генерирую случайное заклинание");
            spellService.generationRandomSpell();
            String generateSpell = scanner.nextLine();
            System.out.println("Введите номер персонажа, если это первый - первый, если второй - второй");
            String numberFighter = scanner.nextLine();
            if (numberFighter.equals("первый"))
            {
                Fighter fighter1 = new Fighter(choiceYouRace, choiseWeapon,
                        choiceHealth, choiceMana, choiceUltimate, generateSpell);
                fighters.add(fighter1);
                System.out.println("Персонаж успешно создан");
            }
            if (numberFighter.equals("второй"))
            {
                Fighter fighter2 = new Fighter(choiceYouRace, choiseWeapon,
                        choiceHealth, choiceMana, choiceUltimate, generateSpell);
                fighters.add(fighter2);
                System.out.println("Персонаж успешно создан");
            }

        }
        if (choiceRace.equals("2"))
        {
            System.out.println("Введите свою рассу - Орк");
            String choiceYouRace = scanner.nextLine();
            System.out.println("Генерирую случайное оружие");
            weaponService.generationRandomWeapon();
            String choiseWeapon = scanner.nextLine();
            System.out.println("Запишите ваше здоровье - 150");
            String choiceHealth = scanner.nextLine();
            System.out.println("Запишите вашу ману - 50");
            String choiceMana = scanner.nextLine();
            System.out.println("Запишите вашу способность - Берсерк");
            String choiceUltimate = scanner.nextLine();
            System.out.println("Генерирую случайное заклинание");
            spellService.generationRandomSpell();
            String generateSpell = scanner.nextLine();
            System.out.println("Введите номер персонажа, если это первый - первый, если второй - второй");
            String numberFighter = scanner.nextLine();
            if (numberFighter.equals("первый"))
            {
                Fighter fighter1 = new Fighter(choiceYouRace, choiseWeapon,
                        choiceHealth, choiceMana, choiceUltimate, generateSpell);
                fighters.add(fighter1);
                System.out.println("Персонаж успешно создан");
            }
            if (numberFighter.equals("второй"))
            {
                Fighter fighter2 = new Fighter(choiceYouRace, choiseWeapon,
                        choiceHealth, choiceMana, choiceUltimate, generateSpell);
                fighters.add(fighter2);
                System.out.println("Персонаж успешно создан");
            }
        }
        if (choiceRace.equals("3"))
        {
            System.out.println("Введите свою рассу - Нежить");
            String choiceYouRace = scanner.nextLine();
            System.out.println("Генерирую случайное оружие");
            weaponService.generationRandomWeapon();
            String choiseWeapon = scanner.nextLine();
            System.out.println("Запишите ваше здоровье - 60");
            String choiceHealth = scanner.nextLine();
            System.out.println("Запишите вашу ману - 150");
            String choiceMana = scanner.nextLine();
            System.out.println("Запишите вашу способность - Призыв нежити");
            String choiceUltimate = scanner.nextLine();
            System.out.println("Генерирую случайное заклинание");
            spellService.generationRandomSpell();
            String generateSpell = scanner.nextLine();
            System.out.println("Введите номер персонажа, если это первый - первый, если второй - второй");
            String numberFighter = scanner.nextLine();
            if (numberFighter.equals("первый"))
            {
                Fighter fighter1 = new Fighter(choiceYouRace, choiseWeapon,
                        choiceHealth, choiceMana, choiceUltimate, generateSpell);
                fighters.add(fighter1);
                System.out.println("Персонаж успешно создан");
            }
            if (numberFighter.equals("второй"))
            {
                Fighter fighter2 = new Fighter(choiceYouRace, choiseWeapon,
                        choiceHealth, choiceMana, choiceUltimate, generateSpell);
                fighters.add(fighter2);
                System.out.println("Персонаж успешно создан");
            }

        }
    }

    public void seeFighter()
    {
        for (Fighter fighter : fighters)
        {
            System.out.println(fighters.get(1));
        }
    }

}

