package ljv65.sorting;

import ljv65.model.Actor;

import java.util.Comparator;

public class ActorByNameComparator implements Comparator<Actor>
{

    @Override
    public int compare(Actor actor1, Actor actor2)
    {
        return actor1.name.compareTo(actor2.name);

    }
}
