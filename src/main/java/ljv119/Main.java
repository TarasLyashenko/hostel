package ljv119;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();

        String name = "Андрей";
        int age = 15;
        String phoneNumber = "89153211284";
        String position = employee.getPosition();
        Employee andrey = new Employee(name, age, phoneNumber, position);


    }
}
