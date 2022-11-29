package ljv88;

import ljv88.service.Randoms;

public class Main
{
    public static void main(String[] args)
    {
        Randoms random = new Randoms();
        System.out.println(random.getRandomValue(8,16));
    }
}
