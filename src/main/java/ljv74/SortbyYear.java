package ljv74;

import java.util.Comparator;

public class SortbyYear implements Comparator<Car>
{

    @Override
    public int compare(Car car1, Car car2)
    {
        if (car1.year == car2.year)
        {
            return 0;
        }
        if (car1.year < car2.year)
        {
            return 1;
        }
        return -1;
    }
}
