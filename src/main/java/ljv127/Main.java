package ljv127;

public class Main
{
    public static void main(String[] args)
    {
//        try
//        {
//            int actorAge = 30;
//            if (actorAge >= 30)
//            {
//                throw new ActorTooOldException();
//            }
//        }
//        catch (ActorTooOldException e)
//        {
//            System.out.println("Слушай...Кажется тебе надо поискать другую работу");
//        }
        try
        {
            int daysWorkoutSkipped = 1;
            int weightBarbell = 20;
            if (daysWorkoutSkipped >= 1)
            {
                weightBarbell++;
                throw new SkipWorkoutException();
            }
        } catch (SkipWorkoutException e)
        {
            System.out.println("Почему все такое тяжелое??");
        }
    }
}

