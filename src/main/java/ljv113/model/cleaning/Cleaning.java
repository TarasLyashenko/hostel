package ljv113.model.cleaning;

import ljv113.model.Employee;

public abstract class Cleaning extends Employee
{
    public String plasesToWash;
    public int numberOfInventory;
    public int numberOfHoursAtWork;

    public void pretentToWash()
    {
        System.out.println("Ой как тут гряязно, надо еще помыть");
        numberOfHoursAtWork++;
    }
}
