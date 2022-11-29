package ljv123;

public class Main2
{
    public static void main(String[] args)
    {
        System.out.println(printNumber());
    }

    private static int printNumber()
    {
        try
        {
            return 21;
        }
        catch (Exception e)
        {
            return 100;
        }
        finally
        {
            System.out.println("Вообше похую на ваше 21");
            return 55555;
        }
    }
}
