package ljv110.model.effect;

public class Effect
{
    public String name;

    public void calculateEffect(Solder solder)
    {
        System.out.println("Применен эффект " + name + " на " + solder.name);
    }
}
