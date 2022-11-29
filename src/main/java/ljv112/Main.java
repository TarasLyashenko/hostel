package ljv112;

import ljv112.model.Animal;
import ljv112.model.Cat;
import ljv112.model.Dog;
import ljv112.model.Hamster;
import ljv112.service.AnimalService;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Animal> listOfAnimals = new ArrayList<>();
        AnimalService animalService = new AnimalService();

        Animal cat = new Cat();
        cat.name = "Муся";
        cat.age = 5;
        listOfAnimals.add(cat);


        Animal dog = new Dog();
        dog.name = "Фрэнк";
        dog.age = 119;
        listOfAnimals.add(dog);

        Animal hamster = new Hamster();
        hamster.name = "Морти";
        hamster.age = 1;
        listOfAnimals.add(hamster);

        animalService.printAllAnimals(listOfAnimals);
        animalService.sayForAllAnimals(listOfAnimals);






    }
}
