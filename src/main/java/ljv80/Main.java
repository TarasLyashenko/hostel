package ljv80;

import ljv80.comparator.HotelCombineSortCityOrStars;
import ljv80.comparator.HotelSortCityByAlphabeticalOrder;
import ljv80.comparator.HotelSortCityByAlphabeticalReverseOrder;
import ljv80.model.Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Hotel> list = new ArrayList<>();
        list.add(new Hotel("Барбарис", 3, "Москва"));
        list.add(new Hotel("Леопард", 3, "Питер"));
        list.add(new Hotel("Магнолия", 3, "Питер"));
        list.add(new Hotel("Свинья в долине", 5, "Москва"));
        list.add(new Hotel("Через Амстердам", 5, "Москва"));
        list.add(new Hotel("Фонтанка", 5, "Питер"));
        list.add(new Hotel("Есенин", 5, "Питер"));
        list.add(new Hotel("Граф Орлов", 5, "Питер"));

        Collections.sort(list, new HotelCombineSortCityOrStars());
        for (Hotel seeList : list)
        {
            System.out.println(seeList.city + " " + seeList.numbersOfStars + " " + seeList.title);
        }
    }
}
