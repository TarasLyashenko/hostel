package ljv84.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FighterService
{
    Scanner scanner = new Scanner(System.in);
    Map<Integer, String> mapFighter = new HashMap<>();

    public void addFighter()
    {

        System.out.println("Выберите рассу:\n" +
                "1 - Человек\n" +
                "2 - Вампир\n");
        String choiseRace = scanner.nextLine();
        if (choiseRace.equals("1"))
        {
            mapFighter.put(1, "Человек");
            System.out.println(mapFighter.get(1) + " Добавлен");
        }
        if (choiseRace.equals("2"))
        {
            mapFighter.put(2, "Вампир");
            System.out.println(mapFighter.get(2) + "Добавлен");
        }
    }

    public void showFighters1()
    {
        System.out.println(mapFighter.get(1));
    }

    public void showFighters2()
    {
        System.out.println(mapFighter.get(2));
    }

//    public void showListComand()
//    {
//
//    }
}
