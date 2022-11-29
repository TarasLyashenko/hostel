package arasakaTower.model;

public class Robots extends NotLivingOrganism
{
    public Robots(String name, int hp, Weapons weapons)
    {
        super(name, hp, weapons);
    }

    public Robots(String name, int hp)
    {
        super(name, hp);
    }
}
