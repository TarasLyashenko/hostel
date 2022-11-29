package ljv116;

import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {

        Set<String> set = new HashSet<>(); // Создание множества

        set.add("String1"); // Добавление множества
        set.add("String2");
        set.add("String3");
        set.add("String4");

        set.remove("String2");// Удаление элемента множества
        System.out.println(set.contains("String2")); // Проверка содержится ли элемент в множестве
        System.out.println(set.size()); // Возвращает размер множества
        System.out.println(set.isEmpty()); // возвращает true если множество пустое, и false если там есть хотя бы 1 элемент

        for (String showSet : set)
        {
            System.out.println(showSet); //Вывод всех элементов
        }
         //set.clear() - Чистит коллекцию

    }
}
