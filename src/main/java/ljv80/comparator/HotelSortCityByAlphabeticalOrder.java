package ljv80.comparator;

import ljv80.model.Hotel;

import java.util.Comparator;

public class HotelSortCityByAlphabeticalOrder implements Comparator<Hotel> //В алфавитном порядке
{
    @Override
    public int compare(Hotel hotel1, Hotel hotel2)
    {
        return hotel1.city.compareTo(hotel2.city);
    }
}
