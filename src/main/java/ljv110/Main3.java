package ljv110;

import ljv110.model.effect.Effect;
import ljv110.model.effect.HealEffect;
import ljv110.model.effect.PoisonEffect;
import ljv110.model.effect.Solder;

import java.util.ArrayList;
import java.util.List;

public class Main3
{
    public static void main(String[] args)
    {
        Solder solder = new Solder();
        solder.name = "Виктор";
        solder.hp = 100;

        PoisonEffect poisonEffect = new PoisonEffect();
        poisonEffect.name = "отравление";

        HealEffect heal = new HealEffect();
        heal.name = "Хил";

        List<Effect> listEffect = new ArrayList<>(); //Приведение типов
        listEffect.add(poisonEffect);
        listEffect.add(heal);

        for (Effect effect : listEffect)
        {
            effect.calculateEffect(solder);
        }

        System.out.println(solder.hp + " hp");
    }
}
