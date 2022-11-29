package ljv62;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ObjectString
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File objectString = new File("C:\\Files\\Object.txt");
        Scanner scanObject = new Scanner(objectString);
        while (scanObject.hasNextLine())
        {
            String textTicket = scanObject.nextLine();
            String[] cutObjectString = textTicket.split("-");
            String title = cutObjectString[0];
            int price = Integer.parseInt(cutObjectString[1]);
            String location = cutObjectString[2];
            Ticket ticket = new Ticket(title, price, location);
            System.out.println(ticket.title + " " + ticket.price + " " + ticket.location);
        }
        scanObject.close();


    }
}
