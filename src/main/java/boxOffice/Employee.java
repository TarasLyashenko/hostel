package boxOffice;

import java.util.Scanner;

public class Employee
{
    public String fullName;
    public int age;
    public String gender;
    public float workExperience;
    public String position;
    public String numberPhone;
    public String passporID;
    public String residentialAddress;


    public Employee(String name, int ages, String genders,
                    float work, String positions, String phone,
                    String iD, String adress)
    {
        fullName = name;
        age = ages;
        gender = genders;
        workExperience = work;
        position = positions;
        numberPhone = phone;
        passporID = iD;
        residentialAddress = adress;
    }

    public Employee(String name)
    {
        fullName = name;
    }

    public Employee(Scanner scannerList)
    {
        
    }
}
