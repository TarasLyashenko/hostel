package biletics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main
{


    public static void main(String[] args) throws IOException
    {
        Map<String, String> map = new HashMap<>();
        int numberTicket = 0;
        List<Ticket> allTicket = new ArrayList<>();
        System.out.println("Приветствую! Наша программа поможет вам приобрести билет!" +
                " Нажмите 1 - купить билет, 2 - показать список всех билетов, выход - для выхода :)");
        FileWriter ticketEntry = new FileWriter("C:\\Users\\Данила\\AllTicket.txt");
        while (true)
        {
            Scanner programScan = new Scanner(System.in);
            String resultScan = programScan.nextLine();
            if (resultScan.equals("выход"))
            {
                ticketEntry.write("Куплено билетов: " + numberTicket + "\n \n" + "Купленные билеты: \n");
                for (Ticket tickets : allTicket)
                {

                    ticketEntry.write(tickets.staging + " - " + tickets.price + "\n");

                }
                ticketEntry.write("\nОтзывы: \n");
                for (Map.Entry<String, String> pair : map.entrySet())
                {
                    String key = pair.getKey();
                    String value = pair.getValue();
                    ticketEntry.write(key + ": " + value + "\n");
                }
                ticketEntry.close();
                return;
            }
            else if (resultScan.equals("1"))
            {
                System.out.println("Введите название постановки");
                String productionTitle = programScan.nextLine();
                System.out.println("Введите цену билета");
                int priceTicket = Integer.parseInt(programScan.nextLine());
                numberTicket++;
                Ticket newTicket = new Ticket(productionTitle, priceTicket);
                allTicket.add(newTicket);
                System.out.println("Успешно приобретено!");
            }
            else if (resultScan.equals("2"))
            {
                for (Ticket ticket : allTicket)
                {
                    System.out.println(ticket.staging + " - " + ticket.price);
                }
            }
            else if (resultScan.equals("3"))
            {
                System.out.println("На какую постановку вы хотите оставить отзыв?");
                for (Ticket showStading : allTicket)
                {
                    System.out.println(showStading.staging);
                }
                String choiceStading = programScan.nextLine();
                System.out.println("Напишите ваш отзыв!");
                String review = programScan.nextLine();
                map.put(choiceStading, review);
                System.out.println("Отзыв успешно добавлен, спасибо.");

            }

        }
    }

}
