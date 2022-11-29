package theaterticketservice;

import java.util.ArrayList;
import java.util.List;

public class TheaterTicketService
{
    public List<Ticket> tickets = new ArrayList<>();

    public void generateETickets(int count, int myprice, Perfomance myperformance)
    {
        for (int i = 0; i < count; i++)
        {
            Ticket ticket = new Ticket();
            ticket.number = i + 1;
            ticket.perfomanceTitle = myperformance.tittle;
            ticket.price = myprice;

            tickets.add(ticket);
        }

    }

//    public Ticket sellTicket()
//    {\
//
//
//        return null;
//    }


}






