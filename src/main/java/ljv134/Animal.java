package ljv134;

public class Animal implements Wofable
{
    private static final String DOG_GREETING = "ГАВ ГАВ!";
    public static int numberAnimals;

    public String breed;
    public String gender;


    public Animal()
    {
        Animal.numberAnimals++;
    }

    @Override
    public void wof()
    {
        System.out.println(DOG_GREETING);
    }
}
