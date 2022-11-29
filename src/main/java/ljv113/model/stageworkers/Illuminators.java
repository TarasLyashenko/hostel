package ljv113.model.stageworkers;

public class Illuminators extends StageWorkers
{
    public int numbersOfLightningFixtures;
    public String deviceNames;


    @Override
    public void portrayWork()
    {
        super.portrayWork();
        System.out.println("Да...Нам еще нужно столько сделать по свету");
        numberOfHoursAtWork++;
    }
}
