package ljv110.model.effect;

public class PoisonEffect extends Effect
{
    @Override
    public void calculateEffect(Solder solder)
    {
      super.calculateEffect(solder);
      solder.hp -= 10;
    }
}
