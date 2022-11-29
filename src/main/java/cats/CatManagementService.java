package cats;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatManagementService
{
  public List<Cat> addedСats = new ArrayList<>();
    //метод saveCats

//    public void addCat()
//    {
//        Scanner scannerCat = new Scanner(System.in);
//        System.out.println("Введите имя котика");
//        String catName = scannerCat.nextLine();
//        System.out.println("Введите возраст котика");
//        float catAge = Float.valueOf(scannerCat.nextLine());
//        System.out.println("Введите породу котика");
//        String catBreed = scannerCat.nextLine();
//        System.out.println("Введите вес котика");
//        float catWeight = Float.parseFloat(scannerCat.nextLine());
//        System.out.println("Введите цвет котика");
//        String catColor = scannerCat.nextLine();
//        System.out.println("Введите характер котика");
//        String catCharacter = scannerCat.nextLine();
//        System.out.println("Введите цену котика");
//        int catPrice = Integer.parseInt(scannerCat.nextLine());
//        System.out.println("Выберите пол котика:");
//        genderCat();
//        String catGender = (scannerCat.nextLine());
//        if (catGender.equals("1"))
//        {
//            catGender = "Мальчик";
//        }
//        else if (catGender.equals("2"))
//        {
//            catGender = "Девочка";
//
//        }
//        Cat cat = new Cat(catName, catAge, catBreed, catWeight, catColor,
//                catCharacter, catPrice, catGender);
//        addedСats.add(cat);
//        if (catGender.equals("Мальчик"))
//        {
//            System.out.println("Кот " + catName + " успешно добавлен.");
//        }
//        else if (catGender.equals("Девочка"))
//        {
//            System.out.println("Кошка " + catName + " успешно добавлена");
//        }
//
//    }
//
//
//    public void genderCat()
//    {
//        System.out.println(1 + " - Мальчик \n" + 2 + " - Девочка");
//    }
//
//    public void showAllCats()
//    {
//        for (Cat cat : addedСats)
//        {
//
//
//            if (cat.gender.equals("Мальчик"))
//            {
//                System.out.println("Кот:" + cat.name + " " + "Возраст:" + cat.age + " " + "Пол:" + cat.gender + " " +
//                        "Порода: " + cat.breed + " " + "Цвет:" + cat.color + " " + "Характер:" + cat.character + " " +
//                        "Вес:" + cat.weight + " " + "Цена:" + cat.price);
//            }
//            else if (cat.gender.equals("Девочка"))
//            {
//                System.out.println("Кошка:" + cat.name + " " + "Возраст:" + cat.age + " " + "Пол:" + cat.gender + " " +
//                        "Порода: " + cat.breed + " " + "Цвет:" + cat.color + " " + "Характер:" + cat.character + " " +
//                        "Вес:" + cat.weight + " " + "Цена:" + cat.price);
//            }
//        }
//    }


//    public static String catsToString(Cat cat)
//    {
//        String assemblingCats = cat.name + ";" + cat.age + ";" + cat.breed + ":" + cat.weight + ":"
//                + cat.color + ";" + cat.character + ";" + cat.price + ";" + cat.gender;
//        return assemblingCats;
//    }
//
//    public static void build(String strings) throws Exception
//    {
//       FileWriter writerCat = new FileWriter("C:\\Users\\Данила\\MyCat.txt");
//       String[] employee = strings.split(";");
//       writerCat.write(catsToString());

    }




