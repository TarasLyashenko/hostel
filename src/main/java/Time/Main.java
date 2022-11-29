package Time;

import Time.service.TimeService;

import java.io.IOException;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args) throws IOException
    {
        TimeService timeService = new TimeService();
        Scanner scanComand = new Scanner(System.in);
        System.out.println("Добро пожаловать в программу учета времени програмировния!" +
                "\nДля старта записи нажмите - 1\n" +
                "Для окончания записи - 2");

        while (true)
        {
            String choiceComand = scanComand.nextLine();
            if (choiceComand.equals("1"))
            {
                timeService.startIdea();
            }
            else if (choiceComand.equals("2"))
            {
                timeService.closeIdea();
            }
        }
    }

}
