package com.liashenko.animalhotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Алло");
        listString.add("Вы в Киргизии?");
        listString.add("У вас");
        listString.add("Телефон");
        listString.add("Киргизский");
        for (String result : listString)
        {
            System.out.print(result + ", ");
        }
    }
}