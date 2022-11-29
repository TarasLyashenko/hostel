package ljv110.model;

import java.util.ArrayList;
import java.util.List;

public class Main2
{
    public static void main(String[] args)
    {
        Monster monster1 = new Monster();
        monster1.name = "monster 1";

        Monster monster2 = new Monster();
        monster2.name = "monster 2";

        Animal dog = new Dog();
        dog.name = "sobaka";

        WaterMonster waterMonster = new WaterMonster();
        waterMonster.name = "monster3";
        waterMonster.numberPlavnikov = 8;

        List<Animal> animalList = new ArrayList<>();
        animalList.add(monster1);
        animalList.add(monster2);
        animalList.add(dog);
        animalList.add(waterMonster);

        for (Animal animal : animalList)
        {
            animal.eat();
        }

    }
}
