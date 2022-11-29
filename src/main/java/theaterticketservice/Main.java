package theaterticketservice;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Perfomance gusiLebedi = new Perfomance();
        gusiLebedi.tittle = "Only 3 days";

        Actor pasha = new Actor();
        pasha.age = 18;
        pasha.name = "Павлик";

        Actor ivan = new Actor();
        ivan.name = "Ваня";
        ivan.age = 34;

        gusiLebedi.actors.add(pasha);
        gusiLebedi.actors.add(ivan);

        Perfomance midnightMadness = new Perfomance();
        midnightMadness.tittle = "First time in your city";

        Actor suliman = new Actor();
        suliman.age = 24;
        suliman.name = "Илья";

        Actor viola = new Actor();
        viola.age = 65;
        viola.name = "Роман";

        midnightMadness.actors.add(viola);
        midnightMadness.actors.add(suliman);


        Theater bigKyrgyzstanTeater = new Theater();
        bigKyrgyzstanTeater.adress = "Umay Zhiraya 21-b";
        bigKyrgyzstanTeater.perfomances.add(gusiLebedi);
        bigKyrgyzstanTeater.perfomances.add(midnightMadness);

        TheaterTicketService    saleService = new TheaterTicketService();
        saleService.generateETickets(10, 650, gusiLebedi);

        while (true)
        {
            Scanner programScan = new Scanner(System.in);
            String resultScan = programScan.nextLine();
            if (resultScan.contains("выход"))
            {
                break;
            }
            else if (resultScan.equals("показать билеты"))
            {

                for (Ticket ticket : saleService.tickets)
                {
                    System.out.println(ticket.perfomanceTitle + ", " + ticket.price + ", " + ticket.number);
                }

            }
            else if (resultScan.equals("купить билет"))
            {

            }
            else
            {
                System.out.println("запрос принят");
            }

        }
    }
}
