package arasakaTower.model;

public class Human extends LivingOrganism
{
    public Human(String name, String classes, int hp, int strengthOfConsciousness, Weapons weapon)
    {
        super(name, classes, hp, strengthOfConsciousness, weapon);
    }

    public Human(String name, String classes, int hp, int strengthOfConsciousness)
    {
        super(name, classes, hp, strengthOfConsciousness);
    }

    public Human(Human human, Arms arms, CyberImplants cyberImplants)
    {
        super();
    }

    public Human()
    {

    }
}
