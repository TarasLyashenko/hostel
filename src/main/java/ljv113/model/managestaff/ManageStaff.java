package ljv113.model.managestaff;

import ljv113.model.Employee;

public abstract class ManageStaff extends Employee
{
    public int amoutOfMoney;
    public String schedule;

    public void collectMoneyForNeeds()
    {
        System.out.println("У нас кхм... Закончилось кое что");
        amoutOfMoney--;
    }
}
