package ljv72;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.println("Добро пожаловать в программу записи имен, начните вводить имена," +
                " для выхода наберите выход.");
        while (true)
        {
            String name = scanner.nextLine();
            if (name.equals("выход"))
            {
                Collections.sort(names);
                System.out.println(System.lineSeparator());
                for (String showNames : names)
                {
                    System.out.println(showNames);
                }
                System.exit(0);
            }
            else
            {
                names.add(name);
            }
        }
    }
}

