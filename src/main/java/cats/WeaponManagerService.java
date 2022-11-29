package cats;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeaponManagerService
{
    List<Weapon> addedWeapons = new ArrayList<>();//List продпжи + инициализация
    Scanner weaponScanner = new Scanner(System.in);

    public void secretMessage() throws InterruptedException
    {
        System.out.println("Спасибо за использование нашего сервиса, мяу.");
        String scanSecret = weaponScanner.nextLine();
        if (scanSecret.equals("я хочу продолжить"))
        {
            System.out.println("Произошла ошибка");
            Thread.sleep(1000);
            System.out.println("Спасибо за использование нашего сервиса, мяу.");
            String scanSecretАgain = weaponScanner.nextLine();
            if (scanSecretАgain.equals("я.хочу.продолжить."))
            {
                System.out.println("Обработка");
                Thread.sleep(1500);
                System.out.println("Введите пароль");
                String secretPassword = weaponScanner.nextLine();
                if (secretPassword.equals("мяу мяу мяу!"))
                {
                    gunShop();
                }
                else
                {
                    System.out.println("Неверный пароль, ваше устройство будет уничтожено через: \n");
                    System.out.println("5 \n");
                    Thread.sleep(1000);
                    System.out.println("4 \n");
                    Thread.sleep(1000);
                    System.out.println("3 \n");
                    Thread.sleep(1000);
                    System.out.println("2 \n");
                    Thread.sleep(1000);
                    System.out.println("1 \n");
                    Thread.sleep(1000);
                    System.exit(0);
                }
            }
            else
            {
                System.out.println("До новых встреч");
                System.exit(0);
            }
        }
        else
        {
            System.exit(0);
        }
    }

    public void gunShop()
    {
        System.out.println("Мы рады приветствовать вас в нашем магазине оружия.Для выхода наберите - выход." +
                " Выберите нужную вам категорию:");
        showAllWeaponCategory();
        String categorySelection = weaponScanner.nextLine();
        if (categorySelection.equals("1"))
        {
            weaponPistols();
        }
        else if (categorySelection.equals("2"))
        {
            weaponAutomaticRifle();
        }
        else if (categorySelection.equals("3"))
        {
            weaponGrenades();
        }
        else if (categorySelection.equals("выход"))
        {
            endOfShopping();
        }
    }

    public void showAllWeaponCategory()
    {
        System.out.println("1 - Пистолеты \n 2 - Автоматы \n 3 - гранаты");
    }

    public void weaponPistols()
    {
        System.out.println("В наличии следующие пистолеты: \n" +
                "1 - Beretta 92:\n Вес:0,950 кг, патрон:9×19 мм, калибр:9мм, скорость пули:390 м/с, Цена:1100$ \n " +
                "2 - Glock 17: \n Вес:0.905кг, патрон:9×19 мм Парабеллум, калибр:9мм, скорость пули:375 м/с, Цена:1000 \n" +
                "3 - Colt M1911: \n Вес:1.12 кг, патрон:.45 ACP, калибр:11,43×23 мм, скорость пули:260 м/с, Цена:900 \n");
        System.out.println("Какой пистолет желаете купить? Цифра - выбор");
        String choicePistols = weaponScanner.nextLine();
        if (choicePistols.equals("1"))
        {
            System.out.println("Cколько штук вы хотите купить?");
            String amountPistolsBeretta = weaponScanner.nextLine();
            Weapon beretta92 = new Weapon("Пистолет", "Beretta92", amountPistolsBeretta, 1100);
            addedWeapons.add(beretta92);
            System.out.println("Пистолет Beretta 92 - добавлен в вашу корзину ");
            gunShop();
        }
        else if (choicePistols.equals("2"))
        {
            System.out.println("Cколько штук вы хотите купить?");
            String amountPistolsGlock = weaponScanner.nextLine();
            Weapon glock17 = new Weapon("Пистолет", "Glock 17", amountPistolsGlock, 1000);
            addedWeapons.add(glock17);
            System.out.println("Пистолет Glock 17 - добавлен в вашу корзину ");
            gunShop();
        }
        else if (choicePistols.equals("3"))
        {
            System.out.println("Cколько штук вы хотите купить?");
            String amountPistolsColt = weaponScanner.nextLine();
            Weapon coltM1911 = new Weapon("Пистолет", "ColtM1911", amountPistolsColt, 900);
            addedWeapons.add(coltM1911);
            System.out.println("Пистолет Colt M1911 - добавлен в вашу корзину");
            gunShop();
        }
    }

    public void weaponAutomaticRifle()
    {
        System.out.println("В наличии следующие автоматы: \n" +
                "1 - М16:\n Вес:3,4 кг, патрон:5,56×45 мм, калибр:5,56, скорость пули:848 м/с, Цена:3000$ \n " +
                "2 - Ak47: \n Вес:3,8кг, патрон:7,62×39 мм , калибр:7,62, скорость пули:715 м/с, Цена:2000$ \n");
        System.out.println("Какой автомат желаете купить? Цифра - выбор");
        String choiceRifle = weaponScanner.nextLine();
        if (choiceRifle.equals("1"))
        {
            System.out.println("Cколько штук вы хотите купить?");
            String amountRifleM16 = weaponScanner.nextLine();
            Weapon m16 = new Weapon("Автомат", "М16", amountRifleM16, 3000);
            addedWeapons.add(m16);
            System.out.println("Автомат M16 - добавлен в вашу корзину ");
            gunShop();
        }
        else if (choiceRifle.equals("2"))
        {
            System.out.println("Cколько штук вы хотите купить?");
            String amountRifleAk = weaponScanner.nextLine();
            Weapon ak47 = new Weapon("Автомат", "Ak47", amountRifleAk, 2000);
            addedWeapons.add(ak47);
            System.out.println("Автомат Ak47 - добавлен в вашу корзину ");
            gunShop();
        }
    }

    public void weaponGrenades()
    {
        System.out.println("В наличии следующие гранаты: \n" +
                "1 - РГД-5:\n Вес:0,31кг, Масса взрывчатого вещества:0,110кг, радиус поражения:15-20 метров, Цена:500$ \n" +
                "2 - Ф1:\n Вес:0,6кг, Масса взрывчатого вещества:0,06, радиус поражения:40 метров, Цена:700$ \n");
        System.out.println("Какую гранату желаете купить? Цифра - выбор");
        String choiceGrenades = weaponScanner.nextLine();
        if (choiceGrenades.equals("1"))
        {
            System.out.println("Cколько штук вы хотите купить?");
            String amountGrenadesRgd = weaponScanner.nextLine();
            Weapon rgd5 = new Weapon("Граната", "Ргд-5", amountGrenadesRgd, 500);
            addedWeapons.add(rgd5);
            System.out.println("Граната Ргд-5 - добавлена в вашу корзину");
            gunShop();
        }
        else if (choiceGrenades.equals("2"))
        {
            System.out.println("Cколько штук вы хотите купить?");
            String amountGrenadesF1 = weaponScanner.nextLine();
            Weapon f1 = new Weapon("Граната", "Ф1", amountGrenadesF1, 700);
            addedWeapons.add(f1);
            System.out.println("Граната Ф1 - добавлена в вашу корзину");
            gunShop();
        }
    }

    public void endOfShopping()

    {
        System.out.println("Благодарим вас за использование нашего магазина оружия,вы купили: \n");
        for (Weapon weapon : addedWeapons)
        {
            System.out.println(weapon.weaponType + ":" + weapon.weaponName +
                    " " + "Колличество:" + weapon.weaponAmount + "шт." + " " + "Цена:");
            sumPrice();
            return;
        }
    }

    public void sumPrice()
    {
        int sumOfWeapon = 0;
        for (Weapon weapon : addedWeapons)
        {
            sumOfWeapon = sumOfWeapon + weapon.weaponPrice;
        }
        System.out.println(sumOfWeapon);
    }
}
