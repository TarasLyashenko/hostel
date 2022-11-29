package ljv113.model.servicestaff;

public class CloakroomAttendant extends ServiceStaff
{
    public int numberOfHangers;

    @Override
    public void makeACompliment()
    {
        super.makeACompliment();
        System.out.print(" в этой одежде! Давайте я вам помогу");
    }
}
