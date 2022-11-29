package ljvmy90.model;

public class Weapon
{
    private String tittle;
    private int minDamage;
    private int maxDamage;

    public String getTittle()
    {
        return tittle;
    }

    public void setTittle(String tittle)
    {
        this.tittle = tittle;
    }

    public int getMinDamage()
    {
        return minDamage;
    }

    public void setMinDamage(int minDamage)
    {
        this.minDamage = minDamage;
    }

    public int getMaxDamage()
    {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage)
    {
        this.maxDamage = maxDamage;
    }

    public Weapon(String tittle, int minDamage, int maxDamage)
    {
        this.tittle = tittle;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
}
