package ljv84;

import ljv84.service.FighterService;
import ljv84.service.RandomFight;

import java.util.Scanner;

public class Main
{


    public static void main(String[] args) throws InterruptedException
    {
        String weaponPlayerOne = "Меч";
        String weaponPlayerTwo = "Кинжал";
        int hpPlayerOne = 100;
        int hpPlayerTwo = 100;
        RandomFight randomFight = new RandomFight();

        FighterService fighterService = new FighterService();
        fighterService.addFighter();
        fighterService.addFighter();
        Scanner scannerFight = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Добро пожаловать в самый кровавый бой! Представим наших персонажей!\n" +
                "В правом углу нашего подземелья легендарный ");
        Thread.sleep(500);
        fighterService.showFighters1();
        System.out.println("У которого в руке:" + weaponPlayerOne);
        System.out.println("В левом углу кровавый и ужасный ");
        Thread.sleep(500);
        fighterService.showFighters2();
        System.out.println("У которого в руке:" + weaponPlayerTwo);
        System.out.println("\n\n");
        Thread.sleep(500);
        randomFight.whoHitsFirst();
        System.out.println("Если ходит первый игрок наберите - первый, если второй - второй");
        while (true)
        {
            String whoHits = scannerFight.nextLine();
            if (whoHits.equals("первый"))
            {
                System.out.println("Ходит: ");
                fighterService.showFighters1();
                System.out.println("Для удара наберите - удар");
                String hits = scannerFight.nextLine();
                if (hits.equals("удар"))
                {
                    randomFight.randomHits();
                    System.out.println("Сколько урона ты нанес?");
                    int amointDamage = Integer.parseInt(scannerFight.nextLine());
                    hpPlayerTwo = hpPlayerTwo - amointDamage;
//                    System.out.println("У ");
//                    fighterService.showFighters2();
//                    System.out.println("Осталось:" + hpPlayerTwo + " ХП!");
                    if (hpPlayerTwo <= 0)
                    {
                        fighterService.showFighters2();
                        System.out.println("Медленно падает на землю, его тело обмякает...Он гибнет\n" +
                                "Победил\n");
                        fighterService.showFighters1();
                        System.out.println("*Звук аплодисментов!*\nДо новых встреч!");
                        System.exit(0);
                    }
                    else if (hpPlayerTwo != 0)
                    {
                        fighterService.showFighters2();
                        System.out.println("Выжил! У него осталось " + hpPlayerTwo + "HP!");
                        randomFight.whoHitsFirst();
                    }
                }
            }
                if (whoHits.equals("второй"))
                {
                    System.out.println("Ходит: ");
                    fighterService.showFighters2();
                    System.out.println("Для удара наберите - удар");
                    String hits2 = scannerFight.nextLine();
                    if (hits2.equals("удар"))
                    {
                        randomFight.randomHits();
                        System.out.println("Сколько урона ты нанес?");
                        int amointDamage = Integer.parseInt(scannerFight.nextLine());
                        hpPlayerOne = hpPlayerOne - amointDamage;
//                        System.out.println("У ");
//                        fighterService.showFighters2();
//                        System.out.println("Осталось:" + hpPlayerTwo + " ХП!");
                        if (hpPlayerOne == 0)
                        {
                            fighterService.showFighters1();
                            System.out.println("Медленно падает на землю, его тело обмякает...Он гибнет\n" +
                                    "Победил\n");
                            fighterService.showFighters2();
                            System.out.println("*Звук аплодисментов!*\nДо новых встреч!");
                            System.exit(0);
                        }
                        else if (hpPlayerOne != 0)
                        {
                            fighterService.showFighters1();
                            System.out.println("Выжил! У него осталось " + hpPlayerOne + "HP!");
                            randomFight.whoHitsFirst();
                        }
                    }
                }
            }
        }
    }



