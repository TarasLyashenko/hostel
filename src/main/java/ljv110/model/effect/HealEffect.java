package ljv110.model.effect;

public class HealEffect extends Effect
{ //Ctrl + O

    @Override
    public void calculateEffect(Solder solder)
    {
        super.calculateEffect(solder);
        solder.hp += 90;
    }
}
