package lvj128.model;

import lvj128.interfaces.Dieable;
import lvj128.interfaces.Eatable;

import java.util.Random;

public class Humster implements Eatable, Dieable
{
    @Override
    public void die()
    {
        Random random = new Random();
        int choiceOfDeath = random.nextInt(3);
        if (choiceOfDeath == 0)
        {
            System.out.println("Я засмотрелся в окно когда сидел на верхней полке и упал");
        }
        else if (choiceOfDeath == 1)
        {
            System.out.println("Сегодня я слишком много поел");
        }
        else if (choiceOfDeath == 2)
        {
            System.out.println("Интересно что будет если попытаться выбраться через тонкую решетку?");
        }
        else if (choiceOfDeath == 3)
        {
            System.out.println("Кажется я не умею плавать головой вниз в поилке");
        }
    }

    @Override
    public void eat()
    {
        System.out.println("Люблю есть орехи");
    }
}
