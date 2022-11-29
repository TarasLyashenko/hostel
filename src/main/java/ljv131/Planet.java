package ljv131;

public enum Planet
{
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO, SUN;

    public void canILiveHere(Planet planet)
    {
        switch (planet)
        {
            case EARTH:
                System.out.println("Ты можешь жить здесь!");
                break;
            default:
                System.out.println("Здесь пока что нельзя жить :(");
                break;
        }
    }
}
