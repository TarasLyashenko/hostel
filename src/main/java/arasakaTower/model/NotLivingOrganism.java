package arasakaTower.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class NotLivingOrganism
{

    private String name;
    private int hp;
    private Weapons weapons;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public Weapons getWeapons()
    {
        return weapons;
    }

    public void setWeapons(Weapons weapons)
    {
        this.weapons = weapons;
    }

    public NotLivingOrganism(String name, int hp, Weapons weapons)
    {
        this.name = name;
        this.hp = hp;
        this.weapons = weapons;
    }

    public NotLivingOrganism(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
    }
}
