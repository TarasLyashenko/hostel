package ljv113.model.actor;

public class SeniorActor extends Actors
{
    public int numberOfSubordinates;

    @Override
    public void goToChill()
    {
        System.out.println("Так у меня сегодня много дел, порепетируйте сами");
        hoursSpentInDressingRoom += 3;
    }
}
