package ljv71;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(4);

        System.out.println("До сортировки:");
        for (int number : list)
        {
            System.out.println(number);
        }

        Collections.sort(list);

        System.out.println(System.lineSeparator());
        System.out.println("После сортировки");
        for (int number : list)
        {
            System.out.println(number);
        }
    }
}
