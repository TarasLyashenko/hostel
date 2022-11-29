package ljv123;

public class Exceptions
{
    public static void main(String[] args)
    {
        try
        {
            getInt();
        }
        catch (NumberFormatException | NullPointerException npe)
        {
            System.out.println("...Я не могу превратить эту строку в число, you know?\n" +
                    "Cходи налей себе чаю и попробуй еще раз");
        }
        finally
        {
            System.out.println("Да..Я тоже здесь");
        }
    }

    private static void getInt()
    {
        int myInt = Integer.parseInt("1");
    }
}
