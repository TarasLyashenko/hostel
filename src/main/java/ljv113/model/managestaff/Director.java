package ljv113.model.managestaff;

public class Director extends ManageStaff
{
    public int moneyInWallet;
    public String ordersForToday;

    @Override
    public void collectMoneyForNeeds()
    {
        super.collectMoneyForNeeds();
        amoutOfMoney -= 100000;
        moneyInWallet += 100000;
    }

    public void talkAboutTheFateOfTheEmployee()
    {

    }
}
