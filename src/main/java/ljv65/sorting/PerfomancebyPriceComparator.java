package ljv65.sorting;

import ljv65.model.Perfomance;

import java.util.Comparator;

public class PerfomancebyPriceComparator implements Comparator<Perfomance>
{
    @Override
    public int compare(Perfomance perfomance1, Perfomance perfomance2)
    {
        if (perfomance1.price == perfomance2.price)
        {
            return 0;
        }
        else if (perfomance1.price < perfomance2.price)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}


