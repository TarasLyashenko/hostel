package ljv74;

import java.util.Comparator;

public class SortByModel implements Comparator<Car>
{
    @Override
    public int compare(Car car1, Car car2)
    {
        return car1.model.compareTo(car2.model);
    }
}
