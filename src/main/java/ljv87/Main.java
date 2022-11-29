package ljv87;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomvalue = random.nextInt(10);
        System.out.println("На вас напал огромный троль защищайтесь!" +
                "Если вам выпадет число от 8 - 10 вы успешно защитились! Если меньше - погибли(");
        System.out.println(randomvalue);
        if (randomvalue == 8 || randomvalue == 9 || randomvalue == 10)
        {
            System.out.println("Успешная защита!Вам удалось скрыться!");
        }
        else
        {
            System.out.println("Вы чувствуете хруст своих костей и обмякаете...");
        }
    }
}
