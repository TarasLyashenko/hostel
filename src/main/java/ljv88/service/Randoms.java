package ljv88.service;

import java.util.Random;

public class Randoms
{
    public int getRandomValue(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
