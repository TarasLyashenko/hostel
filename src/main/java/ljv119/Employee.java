package ljv119;

public class Employee
{
    private String name;
    private int age;
    private String phoneNumber;
    private String position = "Менеджер";

    public Employee(String name, int age, String phoneNumber, String position)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public Employee()
    {

    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
}
