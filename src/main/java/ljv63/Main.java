package ljv63;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        List<Ticket> listTicket = new ArrayList<>();
        File file = new File("C:\\Files\\ListObject.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            String textTicket = scanner.nextLine();
            String[] cutObject = textTicket.split(";");
            String title = cutObject[0];
            int price = Integer.parseInt(cutObject[1]);
            String location = cutObject[2];
            Ticket ticket = new Ticket(title, price, location);
            listTicket.add(ticket);

        }
        for (Ticket showAllTicket : listTicket)
        {
            System.out.println(showAllTicket.title + " " + showAllTicket.price + " " + showAllTicket.location);
        }
        scanner.close();


    }
}
