package ljv64;

import ljv63.Ticket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        List<Tickets> listTickets = new ArrayList<>();
        File file = new File("C:\\Files\\VeryListObject.txt");
        Scanner scanners = new Scanner(file);
        while (scanners.hasNextLine())
        {
            String textTicket = scanners.nextLine();
            String[] cutObject = textTicket.split(";");
            String title = cutObject[0];
            int price = Integer.parseInt(cutObject[1]);
            String location = cutObject[2];
            Tickets tickets = new Tickets(title, price, location);
            listTickets.add(tickets);

        }
        for (Tickets showAllTicket : listTickets)
        {
            System.out.println(showAllTicket.title + " " + showAllTicket.price + " " + showAllTicket.location);
        }
        scanners.close();

    }


}
