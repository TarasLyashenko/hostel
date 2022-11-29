package ljv113.model.stageworkers;

public class SoundEngineer extends StageWorkers
{
    public int numberOfMicrophones;

    @Override
    public void portrayWork()
    {
        super.portrayWork();
        System.out.println("Нам еще весь звук надо настроить...");
        numberOfHoursAtWork++;
    }

    public void checkSound()
    {
        System.out.println("Блин этот кажется барахлит, унесу домой проверить...");
        numberOfMicrophones--;
    }
}
