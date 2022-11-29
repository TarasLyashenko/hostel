package ljv112.service;

import ljv112.model.Animal;

import java.util.List;

public class AnimalService
{
    public void printAllAnimals(List<Animal> listOfAnimals)
    {
        for (Animal animalList : listOfAnimals)
        {
            System.out.println("Имя " + animalList.name + " возраст " + animalList.age);
        }
    }

    public void sayForAllAnimals(List<Animal> listOfAnimals)
    {
        for (Animal listAnimal : listOfAnimals)
        {
            listAnimal.say();
        }
    }
}
