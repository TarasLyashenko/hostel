package ljv65.model;

import java.util.Comparator;

public class Actor
{
    public String name;
    public String surname;
    public String middleName;
    public String phoneNumber;
    public String pasportNumber;
    public int age;
    public int workExperience;
    public String position;
    //Даты рождения

    public Actor(String name, String surname, String middleName, String phoneNumber, String pasportNumber,
                 int age, int workExperience, String position)
    {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.pasportNumber = pasportNumber;
        this.age = age;
        this.workExperience = workExperience;
        this.position = position;
    }
}
