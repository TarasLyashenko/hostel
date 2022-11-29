package arasakaTower.model;

public abstract class LivingOrganism
{
    private String name;
    private String classes;
    private int hp;
    private int strengthOfConsciousness;
    private Weapons weapon;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getClasses()
    {
        return classes;
    }

    public void setClasses(String classes)
    {
        this.classes = classes;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getStrengthOfConsciousness()
    {
        return strengthOfConsciousness;
    }

    public void setStrengthOfConsciousness(int strengthOfConsciousness)
    {
        this.strengthOfConsciousness = strengthOfConsciousness;
    }

    public Weapons getWeapon()
    {
        return weapon;
    }

    public void setWeapon(Weapons weapon)
    {
        this.weapon = weapon;
    }

    public LivingOrganism(String name, String classes, int hp, int strengthOfConsciousness, Weapons weapon)
    {
        this.name = name;
        this.classes = classes;
        this.hp = hp;
        this.strengthOfConsciousness = strengthOfConsciousness;
        this.weapon = weapon;
    }

    public LivingOrganism(String name, String classes, int hp, int strengthOfConsciousness)
    {
        this.name = name;
        this.classes = classes;
        this.hp = hp;
        this.strengthOfConsciousness = strengthOfConsciousness;
    }

    public LivingOrganism()
    {

    }
}
