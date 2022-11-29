package com.liashenko.animalhotel;

public class TheaterBoxOffice
{
    public String location; //адресс кассы
    public String performanceTitle; //постановка
    public int ticketPrice; // цена билета
    public int numberOfTicketsSold; // колличство проданых билетов

    public Ticket sellTicket()
    {
        numberOfTicketsSold++;
        Ticket bilet = new Ticket();
        bilet.price = ticketPrice;
        bilet.performanceTitle = performanceTitle;
        return bilet;
    }

    public int getTotal()
    {
        int generalSale = numberOfTicketsSold * ticketPrice;
        return generalSale;
    }
}

