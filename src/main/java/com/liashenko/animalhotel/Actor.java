package com.liashenko.animalhotel;

public class Actor
{
    public String name;
    public int salary;
    public int countOfPerformances;

    public int calculateSalary()
    {
        int resultSalary = (salary * countOfPerformances);
        return resultSalary;
    }

}
