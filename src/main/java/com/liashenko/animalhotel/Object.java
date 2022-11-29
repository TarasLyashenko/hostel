package com.liashenko.animalhotel;

import java.util.Scanner;

public class Object
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        checkMessage(userString);
    }

    public static void checkMessage(String message)
    {
        if (message.contains("сука"))
        {
            System.out.println("Сообщение заблокировано");
        } else if (message.contains("блять"))
        {
            System.out.println("Cообщение заблокировано");
        } else if (message.contains("пизда"))
        {
            System.out.println("Cообщение заблокировано");
        }
        else
        {
            System.out.println("Сообщение успешно отправлено");
        }
    }
}


