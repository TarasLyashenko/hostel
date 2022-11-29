package com.liashenko.animalhotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array
{
    public static void main(String[] args)
    {
        String[] animals = {"Кошка", "Пес", "Журавль", "Медведь"};
        printArray(animals);

        String[] name2 = {"Сергей", "Николай", "Максим", "Виктор", "Кирилл"};
        printArray(name2);

    }



    static void printArray(String[] result)
    {

        for (int i = 0; i < result.length; i++)
        {
            String name = result[i];
            if (name.contains("е"))
            {
                System.out.println(name);
            }
        }


    }


//        int[] counter = {0, 1, 2, 3, 4};
//        for (int i = 0; i < 5; i++)
//        {
//            System.out.println(counter[i]);
//        }
//

}

