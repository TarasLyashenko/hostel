package theatre;

import theatre.service.PerfomanceService;
import theatre.service.Scanning;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        PerfomanceService perfomanceService = new PerfomanceService();
        Scanner scanner = new Scanner(System.in);
        Scanning scanning = new Scanning();
        scanning.perfomanceService = perfomanceService;
        System.out.println("Приветсвуем вас в программе добавления постановок, наши команды:\n " +
                "1 - Добавить новую постановку \n 2 - Узнать день недели \n 3 - Добавить актеров к постановке" +
                "\n 4 - показать все постановки \n 5 - показать постановку в определенный день"
        );
        while (true)
        {
            String resultScan = scanner.nextLine();
            if (resultScan.equals("1"))
            {
                perfomanceService.buildPerfomance();
                System.out.println("Постановка добавлена");
            }
            else if (resultScan.equals("2"))
            {
                scanning.dayWeek();
            }
            else if (resultScan.equals("3"))
            {
                scanning.whoWorks();
            }
            else if (resultScan.equals("4"))
            {
                perfomanceService.showAllPerfomance();
            }
            else if (resultScan.equals("5"))
            {
                perfomanceService.showDayPerfomance();
            }
        }
    }
}
