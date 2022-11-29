package com.liashenko.animalhotel;

public class Izhevsk
{
    public static void main(String[] args)
    {
        System.out.println(getMax(1, 2));
        System.out.println(getMax(5, 1));
        System.out.println(getMax(165, 222));
    }

    public static int getMax(int max1, int max2)
    {
        if (max1 < max2)
        {
            return max2;
        } else
        {
            return max1;
        }
    }
}





