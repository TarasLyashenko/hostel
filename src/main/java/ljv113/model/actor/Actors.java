package ljv113.model.actor;

import ljv113.model.Employee;

public abstract class Actors extends Employee
{
    public double emotionalBurnout;
    public double hoursSpentInDressingRoom;


    public void portrayActivity()
    {
        System.out.println("Ага вот так делай. ВАУ, очень круто,мне так нравится работать в театре");
        emotionalBurnout += 20;
    }

    public void goToChill()
    {
        System.out.println("Ага вы пока репетируйте мне надо срочно отойти");
        hoursSpentInDressingRoom += 1;
    }

}
