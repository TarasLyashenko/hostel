package ljv65;

import ljv65.service.ActorService;
import ljv65.service.TheaterService;
import ljv65.sorting.ActorByAgeComparator;
import ljv65.sorting.ActorByNameComparator;
import ljv65.sorting.PerfomanceByArtisticDirectorComparator;
import ljv65.sorting.PerfomancebyPriceComparator;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        PerfomancebyPriceComparator perfomancebyPriceComparator = new PerfomancebyPriceComparator();
        PerfomanceByArtisticDirectorComparator perfomanceByArtisticDirectorComparator = new PerfomanceByArtisticDirectorComparator();
        ActorByAgeComparator actorByAgeComparator = new ActorByAgeComparator();
        ActorByNameComparator actorByNameComparator = new ActorByNameComparator();
        ActorService actorService = new ActorService();
        TheaterService theaterService = new TheaterService();
        Scanner scanner = new Scanner(System.in);
        actorService.loadActors();
        theaterService.loadPerfomances();
        System.out.println("Приветсвуем вас в программе по управлению театральными постановками!" +
                " Для начала работы введите нужну вам цифру\n" +
                "Функционал: \n" +
                "1 - Добавить новую постановку\n" +
                "2 - Показать все постановки\n" +
                "3 - Отсортировать постановки по цене\n" +
                "4 - Отсортировать постановки по худ. Руководителю\n" +
                "5 - Удалить постановку\n" +
                "6 - Добавить нового актера\n" +
                "7 - Показать всех актеров\n" +
                "8 - Отсортировать актеров по имени\n" +
                "9 - Отсортировать актеров по возрасту\n" +
                "10 - Удалить актера\n" +
                "выход - для выхода");
        while (true)
        {
            String resultScan = scanner.nextLine();
            if (resultScan.equals("выход"))
            {
                actorService.exitActor();
                theaterService.exitPerfomance();
                break;
            }
            else if (resultScan.equals("1"))
            {
                theaterService.addPerfomance();
            }
            else if (resultScan.equals("2"))
            {
                theaterService.showAllPefomance(perfomancebyPriceComparator);
            }
            else if (resultScan.equals("3"))
            {
                theaterService.showAllPefomance(perfomancebyPriceComparator);
            }
            else if (resultScan.equals("4"))
            {
                theaterService.showAllPefomance(perfomanceByArtisticDirectorComparator);
            }
            else if (resultScan.equals("5"))
            {
                theaterService.removePerfomance();
            }
            else if (resultScan.equals("6"))
            {
                actorService.addActor();
            }
            else if (resultScan.equals("7"))
            {
                actorService.showAllActor(actorByNameComparator);
            }
            else if (resultScan.equals("8"))
            {
                actorService.showAllActor(actorByNameComparator);
            }
            else if (resultScan.equals("9"))
            {
                actorService.showAllActor(actorByAgeComparator);
            }
            else if (resultScan.equals("10"))
            {
                actorService.removeActor();
            }
        }
    }
}
