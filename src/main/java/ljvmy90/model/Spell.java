package ljvmy90.model;

public class Spell
{
    private String tittle;
    private int amountOfManaForSpell;
    private int damage;
    private String castDescription;

    public String getTittle()
    {
        return tittle;
    }

    public void setTittle(String tittle)
    {
        this.tittle = tittle;
    }

    public int getAmountOfManaForSpell()
    {
        return amountOfManaForSpell;
    }

    public void setAmountOfManaForSpell(int amountOfManaForSpell)
    {
        this.amountOfManaForSpell = amountOfManaForSpell;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public String getCastDescription()
    {
        return castDescription;
    }

    public void setCastDescription(String castDescription)
    {
        this.castDescription = castDescription;
    }

    public Spell(String tittle, int amountOfManaForSpell, int damage, String castDescription)
    {
        this.tittle = tittle;
        this.amountOfManaForSpell = amountOfManaForSpell;
        this.damage = damage;
        this.castDescription = castDescription;
    }
}
