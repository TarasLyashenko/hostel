package arasakaTower.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Weapons
{
    private String name;
    private int minDamage;
    private int maxDamage;

    public Weapons(String name, int minDamage, int maxDamage)
    {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public Weapons()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMinDamage()
    {
        return minDamage;
    }

    public void setMinDamage(int minDamage)
    {
        this.minDamage = minDamage;
    }

    public int getMaxDamage()
    {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage)
    {
        this.maxDamage = maxDamage;
    }

}
