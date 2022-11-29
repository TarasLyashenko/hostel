package myFight;

import myFight.service.GenerateFightersService;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        GenerateFightersService fightersService = new GenerateFightersService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для создания персонажа введите 1 , для начала смертельной битвы - 2");
        while (true)
        {
            String choice = scanner.nextLine();
            if (choice.equals("1"))
            {
                fightersService.addNewFighters();
            }
            else if (choice.equals("2"))
            {
                fightersService.seeFighter();
            }
        }
    }
}
