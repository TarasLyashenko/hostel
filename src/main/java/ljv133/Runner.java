package ljv133;

public class Runner implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("Привет я новый поток " + i);
        }
    }
}
