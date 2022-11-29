package ljv80.comparator;

import ljv80.model.Hotel;

import java.util.Comparator;

public class HotelSortStarsByDescending implements Comparator<Hotel>
{

    @Override
    public int compare(Hotel hotel1, Hotel hotel2)
    {
        if (hotel1.numbersOfStars == hotel2.numbersOfStars)
        {
            return 0;
        }
        if (hotel1.numbersOfStars < hotel2.numbersOfStars)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
