package ljv115;

import ljv115.model.Animal;
import ljv115.model.Cat;
import ljv115.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Animal> listOfAnimal = new ArrayList<>();

        Animal dog = new Dog();
        dog.name = "Френк";
        dog.age = 15;
        listOfAnimal.add(dog);

        Animal cat = new Cat();
        cat.name = "Мурзик";
        cat.age = 5;
        listOfAnimal.add(cat);

        for (Animal animal : listOfAnimal)
        {
            animal.showAnimal();
        }
    }
}
