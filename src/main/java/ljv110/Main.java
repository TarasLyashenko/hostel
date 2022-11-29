package ljv110;


import ljv110.model.Monster;
import ljv110.model.SwampWaterMonster;
import ljv110.model.WaterMonster;

public class Main
{
    public static void main(String[] args)
    {

        Monster monster = new Monster();
        monster.name = "David";
        monster.weight = 150;
        monster.numberOfEaten = 30;
        monster.eat();
        monster.sleep();
        monster.walk();
        monster.showName();
        monster.showWeight();
        monster.showNumberEating();
        System.out.println();

        WaterMonster waterMonster = new WaterMonster();
        waterMonster.name = "Ebigail";
        waterMonster.weight = 30;
        waterMonster.numberOfEaten = 100;
        waterMonster.showMonster();
        System.out.println();

        SwampWaterMonster swampWaterMonster = new SwampWaterMonster();
        swampWaterMonster.name = "Kriss";
        swampWaterMonster.weight = 12;
        swampWaterMonster.numberOfEaten = 5;
        swampWaterMonster.showMonster();



   }
}
