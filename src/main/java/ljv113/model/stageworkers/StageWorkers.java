package ljv113.model.stageworkers;

import ljv113.model.Employee;

public abstract class StageWorkers extends Employee
{
    public String necessaryNonsense;
    public String iDontKnowWhatItIs;
    public int numberOfHoursAtWork;

    public void portrayWork()
    {
        System.out.println("Здесь еще ооочень много работы");
        numberOfHoursAtWork ++;
    }
}



