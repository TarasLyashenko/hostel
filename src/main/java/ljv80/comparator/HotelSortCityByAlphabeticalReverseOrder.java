package ljv80.comparator;

import ljv80.model.Hotel;

import java.util.Comparator;

public class HotelSortCityByAlphabeticalReverseOrder implements Comparator<Hotel> //В обратном алфавитном порядке
{
    @Override
    public int compare(Hotel hotel1, Hotel hotel2)
    {
        return hotel2.city.compareTo(hotel1.city);
    }
}
