package ljv70;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Тест1");
        list.add("Тест5");
        list.add("Тест2");
        list.add("Тест3");
        list.add("Тест6");
        list.add("Тест4");

        System.out.println("До сортировки:");
        for (String string : list)
        {
            System.out.println(string);
        }

        Collections.sort(list);

        System.out.println(System.lineSeparator());
        System.out.println("После сортировки");
        for (String string : list)
        {
            System.out.println(string);
        }
    }
}
