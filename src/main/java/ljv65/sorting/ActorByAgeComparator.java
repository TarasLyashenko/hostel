package ljv65.sorting;

import ljv65.model.Actor;

import java.util.Comparator;

public class ActorByAgeComparator implements Comparator<Actor>
{
    @Override
    public int compare(Actor actor1, Actor actor2)
    {
        if (actor1.age == actor2.age)
        {
            return 0;
        }
        if (actor1.age < actor2.age)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
