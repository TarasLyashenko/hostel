package ljv80.comparator;

import ljv80.model.Hotel;

import java.util.Comparator;

public class HotelCombineSortCityOrStars implements Comparator<Hotel>
{
    @Override
    public int compare(Hotel hotel1, Hotel hotel2)
    {
        if (hotel1.city.compareTo(hotel2.city) > 0)
        {
          return 1;
        }
        else if (hotel1.city.compareTo(hotel2.city) < 0)
        {
            return -1;
        }
        else if (hotel1.numbersOfStars > hotel2.numbersOfStars)
        {
            return 1;
        }
        else if (hotel1.numbersOfStars < hotel2.numbersOfStars)
        {
            return -1;
        }
        return 0;
    }
}


