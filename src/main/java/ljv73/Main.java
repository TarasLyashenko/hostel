package ljv73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Добро пожаловать в программу записи чисел," +
                "начните вводить числа, для выхода - 0");
        while (true)
        {
            String number = scanner.nextLine();
            if (number.equals("выход"))
            {
                Collections.sort(numbers);
                System.out.println(System.lineSeparator());
                for (int showNumber : numbers)
                {
                    System.out.println(showNumber);
                }
                System.exit(0);
            }
            else
            {
                int add = Integer.parseInt(number);
                numbers.add(add);
            }
        }
    }
}

