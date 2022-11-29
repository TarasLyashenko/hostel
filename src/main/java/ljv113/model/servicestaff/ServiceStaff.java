package ljv113.model.servicestaff;

import ljv113.model.Employee;

public abstract class ServiceStaff extends Employee
{
    public String productionSchedule;
    public String ListOfGoodWords;

    public void makeACompliment()
    {
        System.out.println("Отлично выглядите!");
    }
}
