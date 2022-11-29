package boxOffice;

import theaterticketservice.Perfomance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleBoxOffice
{
    public int amountTicket;
    public Scanner scanner = new Scanner(System.in);
    public List<Guest> guests = new ArrayList<>();
    public List<String> perfomance = new ArrayList<>();

    public void addPerfomance()
    {
        System.out.println("Какую постановку добавить?");
        String resultScanPerfName = scanner.nextLine();
        perfomance.add(resultScanPerfName);
        System.out.println("Постановка добавлена");
    }

    public void showAllPerfomance()
    {
        for (String perfomance : perfomance)
        {
            System.out.println(perfomance);
        }
    }

    public void saleTicket()
    {

        System.out.println("на какую постановку вы хотите купить билет?");
        for (String perfomance : perfomance)
        {
            System.out.println(perfomance);
        }
        String resultScanPerfomance = scanner.nextLine();
        if (!perfomance.contains(resultScanPerfomance))
        {
            System.out.println("К сожалению билеты на эту постановку сейчас не продаются");
            return;
        }

        System.out.println("Введите имя и фамилию гостя");
        String resultScanName = scanner.nextLine();
        System.out.println("Введите электронную почту");
        String resultScanMail = scanner.nextLine();
        if (!resultScanMail.contains("@"))
        {
            System.out.println("Невалидный формат почты," +
                    " пожалуйста перепроверьте данные и оформите билет заново");
            return;
        }
        System.out.println("Введите номер телефона в формате +7");
        String resultScanPhone = scanner.nextLine();
        int lenghtStringPhone = resultScanPhone.length();
        if (!resultScanPhone.startsWith("+7") || (lenghtStringPhone != 12))
        {
            System.out.println("Невалидный номер телефона, " +
                    "пожалуйста перепроверьте данные и оформите билет заново");
            return;
        }
        Guest guest = new Guest(resultScanName, resultScanMail, resultScanPhone, resultScanPerfomance);
        guests.add(guest);
        amountTicket++;
        System.out.println("Куплен билет на постановку " + resultScanPerfomance);
    }


    public void howMutchTicket()
    {
        System.out.println("Продано " + amountTicket + " билетов.");
    }

    public void showMail()
    {
        for (Guest guest : guests)
        {
            System.out.println(guest.mail);
        }
    }

    public void showGuests()
    {
        for (Guest quest : guests)
        {
            System.out.print(quest.fullName + "\n" + quest.phoneNumber + "\n" + quest.mail + "\n" + "\n");
        }
    }

}



