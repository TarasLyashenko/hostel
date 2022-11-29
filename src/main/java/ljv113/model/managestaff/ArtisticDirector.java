package ljv113.model.managestaff;

import ljv113.model.actor.Actors;

public class ArtisticDirector extends ManageStaff
{
    public int numberFiredActors;
    public int takeFine;

    @Override
    public void collectMoneyForNeeds()
    {
        super.collectMoneyForNeeds();
        amoutOfMoney -= 3000;
    }

    public void fine(Actors actors)
    {
        if (actors.equals("Долбоеб"))
        {
            amoutOfMoney += 3000;
        }
        else if (actors.equals("Что то не то.."))
        {
            numberFiredActors++;
        }
    }
}
