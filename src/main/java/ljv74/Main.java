package ljv74;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Car> list = new ArrayList<>();

        list.add(new Car("volga", 1845));
        list.add(new Car("masda", 1993));
        list.add(new Car("pizho", 2012));
        list.add(new Car("kamri", 1834));
        list.add(new Car("suzuki", 2022));

        Collections.sort(list,new SortbyYear());
//        Collections.sort(list, new SortByModel());

        for (Car showCar : list)
        {
            System.out.println(showCar.model + " | " + showCar.year);
        }
    }
}
