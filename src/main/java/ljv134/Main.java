package ljv134;

public class Main
{
    public static void main(String[] args)
    {
        Animal dog = new Animal();
        dog.breed = "Хаски";
        dog.gender = "Мальчик";
        dog.wof();

        Animal dog1 = new Animal();
        dog.breed = "Питбуль";
        dog.gender = "Девочка";
        dog1.wof();

        Animal dog2 = new Animal();
        dog2.breed = "Дворняжка";
        dog.gender = "Мальчик";
        dog2.wof();

        System.out.println(Animal.numberAnimals);
    }
}
