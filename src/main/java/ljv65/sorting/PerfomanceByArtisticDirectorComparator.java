package ljv65.sorting;

import ljv65.model.Perfomance;

import java.util.Comparator;

public class PerfomanceByArtisticDirectorComparator implements Comparator<Perfomance>
{

    @Override
    public int compare(Perfomance perfomance1, Perfomance perfomance2)
    {
        return perfomance1.artisticDirector.compareTo(perfomance2.artisticDirector);
    }
}
