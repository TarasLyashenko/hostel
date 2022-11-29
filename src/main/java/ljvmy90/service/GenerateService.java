package ljvmy90.service;

import ljvmy90.model.Spell;
import ljvmy90.model.Weapon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GenerateService
{
    public String generateRandomName() throws Exception
    {
        Random random = new Random();
        List<String> names = new ArrayList<>();

        File file = new File("C:\\Новая папка (2)\\Names.txt");
        Scanner scannerFileName = new Scanner(file);
        while (scannerFileName.hasNextLine())
        {
            String stringFromFile = scannerFileName.nextLine();
            names.add(stringFromFile);
        }

        int getRandomNumberName = random.nextInt(names.size());
        String randomName = names.get(getRandomNumberName);
        scannerFileName.close();
        return randomName;
    }


    public Weapon generateRandomWeapon() throws Exception
    {
        Random random = new Random();
        List<Weapon> weapon = new ArrayList<>();

        File file = new File("C:\\Новая папка (2)\\Weapon.txt");
        Scanner scannerFileWeapon = new Scanner(file);
        while (scannerFileWeapon.hasNextLine())
        {
            String stringFromFile = scannerFileWeapon.nextLine();
            String[] cutFile = stringFromFile.split(",");
            String tittle = cutFile[0];
            int minDamage = Integer.parseInt(cutFile[1]);
            int maxDamage = Integer.parseInt(cutFile[2]);
            Weapon weapons = new Weapon(tittle, minDamage, maxDamage);
            weapon.add(weapons);
        }
        int getRandomNumberWeapon = random.nextInt(weapon.size());
        Weapon randomWeapon = weapon.get(getRandomNumberWeapon);
        scannerFileWeapon.close();
        return randomWeapon;
    }

    public Spell generateRandomSpell() throws Exception
    {
        Random random = new Random();
        List<Spell> spells = new ArrayList<>();

        File file = new File("C:\\Новая папка (2)\\Spell.txt");
        Scanner scannerFileSpell = new Scanner(file);
        while (scannerFileSpell.hasNextLine())
        {
            String stringFromFile = scannerFileSpell.nextLine();
            String[] cutFile = stringFromFile.split("---");
            String tittle = cutFile[0];
            int amountOfManaForSpell = Integer.parseInt(cutFile[1]);
            int damage = Integer.parseInt(cutFile[2]);
            String castDescription = cutFile[3];

            Spell spell = new Spell(tittle, amountOfManaForSpell, damage, castDescription);
            spells.add(spell);
        }
        int getRandomNumberSpell = random.nextInt(spells.size());
        Spell randomSpell = spells.get(getRandomNumberSpell);
        scannerFileSpell.close();
        return randomSpell;
    }

    public String generateWayToHit()
    {
        Random randomWay = new Random();
        List<String> wayToHit = new ArrayList<>();
        wayToHit.add("делает три ловких шага подбегая к врагу, заносит руку и ударяет в грудь используя ");
        wayToHit.add("с разворота наносит удар используя ");
        wayToHit.add("ловко подойдя в плотную с легкость попадает в голову используя ");
        wayToHit.add("наносит сильный удар в голову используя ");
        wayToHit.add("пригибается и наносит удар используя ");
        wayToHit.add("успевает подбежать,прыгнуть и нанести удар используя ");
        wayToHit.add("наносит сильный удар по ноге используя ");
        wayToHit.add("наносит удар в колено используя ");
        int getRandomNumber = randomWay.nextInt(wayToHit.size());
        String getRandomString = wayToHit.get(getRandomNumber);
        System.out.print(getRandomString);
        return getRandomString;
    }
    public String generateWayMiss()
    {
        Random randomMiss = new Random();
        List<String> wayToMiss = new ArrayList<>();
        wayToMiss.add("засматривается на бабочку, спотыкается и промахивается");
        wayToMiss.add("разбегается наступает на скользкий камень," +
                " с криком *Бл*тский камень!* больно падает и промахивается");
        wayToMiss.add("не замечает безобидную ящерицу которая больно кусает его в ногу и промахивается");
        wayToMiss.add("Засмотревшись на красивые облака не замечает змею которая больно кусает его и промахивается");
        wayToMiss.add("подобрав нужный момент слишком сильно размахивается" +
                " и больно попадая себе по голове промахивается");
        wayToMiss.add("не заметив скользкий грунт под ногами скользит и промахивается");
        wayToMiss.add("сильно занеся меч наступает на непонятного вида яйцо," +
                " скользит на нем и разрубая себе руку промахивается");
        int getRandomNumber = randomMiss.nextInt(wayToMiss.size());
        String getRandomString = wayToMiss.get(getRandomNumber);
        System.out.print(getRandomString);
        return getRandomString;
    }
}
