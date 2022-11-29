package ljv133;

class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Привет я новый поток!)");
        try
        {
            Thread.sleep(1);
        }
        catch (InterruptedException ie)
        {
            throw new RuntimeException(ie);
        }
    }
}
