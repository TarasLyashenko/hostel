package ljv113.model.servicestaff;

public class Hostess extends ServiceStaff
{
    public int NumberEnteredPeople;

    @Override
    public void makeACompliment()
    {
        super.makeACompliment();
        System.out.print(" Проходите пожалуйста прямо до гардероба");
    }
}
