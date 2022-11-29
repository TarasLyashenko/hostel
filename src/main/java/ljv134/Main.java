package ljv134;

public class Main
{
    public static void main(String[] args)
    {
        Animal dog = new Animal();
        dog.breed = "Хаски";
        dog.gender = "Мальчики";
        Animal.numberAnimals = 3;
        dog.wof();
        System.out.println(dog.breed + " " + dog.gender + " " + Animal.numberAnimals + " штуки");
    }
}
