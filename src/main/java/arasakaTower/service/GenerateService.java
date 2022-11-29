package arasakaTower.service;

import arasakaTower.model.Arms;
import arasakaTower.model.CyberImplants;
import arasakaTower.model.Human;
import arasakaTower.model.Robots;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GenerateService
{
    public Human newHuman() throws FileNotFoundException
    {
        List<Human> listOfHuman = new ArrayList<>();
        Random random = new Random();
        File file = new File("C:\\ArasakaTower\\Humans.txt");
        Scanner scanFile = new Scanner(file);
        while (scanFile.hasNextLine())
        {
            String newHuman = scanFile.nextLine();
            String[] cutStringFile = newHuman.split(",");
            String name = cutStringFile[0];
            String classes = cutStringFile[1];
            int hp = Integer.parseInt(cutStringFile[2]);
            int strengthOfConsciousness = Integer.parseInt(cutStringFile[3]);
            Human addHumans = new Human(name,classes,hp,strengthOfConsciousness);
            listOfHuman.add(addHumans);
        }
        int getRandomHuman = random.nextInt(listOfHuman.size());
        Human randomHuman = listOfHuman.get(getRandomHuman);
        scanFile.close();
        return randomHuman;
    }

    public Arms newArms() throws FileNotFoundException
    {
        List<Arms> listOfArms = new ArrayList<>();
        Random random = new Random();
        File file = new File("C:\\ArasakaTower\\Weapons.txt");
        Scanner scanFile = new Scanner(file);
        while (scanFile.hasNextLine())
        {
            String newWeapons = scanFile.nextLine();
            String[] cutStringFile = newWeapons.split(",");
            String name = cutStringFile[0];
            int minDamage = Integer.parseInt(cutStringFile[1]);
            int maxDamage = Integer.parseInt(cutStringFile[2]);
            Arms newArms = new Arms(name,minDamage,maxDamage);
            listOfArms.add(newArms);
        }
        int getRandomArms = random.nextInt(listOfArms.size());
        Arms randomArms = listOfArms.get(getRandomArms);
        scanFile.close();
        return randomArms;
    }
    public Robots newRobots() throws FileNotFoundException
    {
        List<Robots> listOfRobots= new ArrayList<>();
        Random random = new Random();
        File file = new File("C:\\ArasakaTower\\Robots.txt");
        Scanner scanFile = new Scanner(file);
        while (scanFile.hasNextLine())
        {
            String newRobots = scanFile.nextLine();
            String[] cutStringFile = newRobots.split(",");
            String name = cutStringFile[0];
            int hp = Integer.parseInt(cutStringFile[1]);
            Robots newRobotics = new Robots(name,hp);
            listOfRobots.add(newRobotics);
        }
        int getRandomRobots = random.nextInt(listOfRobots.size());
        Robots randomRobots = listOfRobots.get(getRandomRobots);
        scanFile.close();
        return randomRobots;
    }
    public CyberImplants newImplants() throws FileNotFoundException
    {
        List<CyberImplants> listOfImplants = new ArrayList<>();
        Random random = new Random();
        File file = new File("C:\\ArasakaTower\\Implants.txt");
        Scanner scanFile = new Scanner(file);
        while (scanFile.hasNextLine())
        {
            String newWeapons = scanFile.nextLine();
            String[] cutStringFile = newWeapons.split(",");
            String tittle = cutStringFile[0];
            int damage = Integer.parseInt(cutStringFile[1]);
            int wastingNumberСonsciousness = Integer.parseInt(cutStringFile[2]);
            CyberImplants newImplants = new CyberImplants(tittle,damage,wastingNumberСonsciousness);
            listOfImplants.add(newImplants);
        }
        int getRandomImplants = random.nextInt(listOfImplants.size());
        CyberImplants randomImplants = listOfImplants.get(getRandomImplants);
        scanFile.close();
        return randomImplants;
    }
}
