package ljv133;

public class Main
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(new Runner());
        thread.start();

        Thread thread1 = new Thread(new Runner());
        thread1.start();
    }
}


