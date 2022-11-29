package theatre.service;

import theatre.model.Perfomance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfomanceService
{

    public List<Perfomance> addPerfomance = new ArrayList<>();
    Scanner scanPerfomance = new Scanner(System.in);

    public void buildPerfomance()
    {
        System.out.println("Введите название постановки");
        String perfomanceName = scanPerfomance.nextLine();
        System.out.println("Введите цену");
        int price = Integer.parseInt(scanPerfomance.nextLine());
        System.out.println("Введите текст афишы!");
        String poster = scanPerfomance.nextLine();
        Perfomance newPerfomance = new Perfomance(perfomanceName, price, poster);
        addPerfomance.add(newPerfomance);
    }

    public void showAllPerfomance()
    {
        for (Perfomance showPerfomance : addPerfomance)
        {
            System.out.println(showPerfomance.title + "\n" + showPerfomance.price + "\n" + showPerfomance.poster + "\n");
        }
    }
    public void showDayPerfomance() throws FileNotFoundException
    {
        System.out.println("Введите номер дня недели что бы узнать какие" +
                " в нем есть добавленные постановки от 1 до 7\n");
        String choiseDayPerfomance = scanPerfomance.nextLine();
        if (choiseDayPerfomance.equals("1"))
        {
            File mondayPerfomance = new File("C:\\Users\\Данила\\PerfomanceWeek\\Monday.txt");
            Scanner scanMondayPerf = new Scanner(mondayPerfomance);
            while (scanMondayPerf.hasNextLine())
            {
                String mondayPerf = scanMondayPerf.nextLine();
                System.out.println(mondayPerf);
            }
            scanMondayPerf.close();
        }
        else if (choiseDayPerfomance.equals("2"))
        {
            File file = new File("C:\\Users\\Данила\\PerfomanceWeek\\Tuesday.txt");
            Scanner scanTuesdayPerf = new Scanner(file);
            while (scanTuesdayPerf.hasNextLine())
            {
                String tuesdayPerf = scanTuesdayPerf.nextLine();
                System.out.println(tuesdayPerf);
            }
            scanTuesdayPerf.close();
        }
        else if (choiseDayPerfomance.equals("3"))
        {
            File wednesdayPerfomance = new File("C:\\Users\\Данила\\PerfomanceWeek\\Wednesday.txt");
            Scanner scanWednesdayPerf = new Scanner(wednesdayPerfomance);
            while (scanWednesdayPerf.hasNextLine())
            {
                String wednesdayPerf = scanWednesdayPerf.nextLine();
                System.out.println(wednesdayPerf);
            }
            scanWednesdayPerf.close();
        }
        else if (choiseDayPerfomance.equals("4"))
        {
            File thursdayPerfomance = new File("C:\\Users\\Данила\\PerfomanceWeek\\Thursday.txt");
            Scanner scanThursPerf = new Scanner(thursdayPerfomance);
            while (scanThursPerf.hasNextLine())
            {
                String thursdayPerf = scanThursPerf.nextLine();
                System.out.println(thursdayPerf);
            }
            scanThursPerf.close();
        }
        else if (choiseDayPerfomance.equals("5"))
        {
            File fridayPerfomance = new File("C:\\Users\\Данила\\PerfomanceWeek\\Friday.txt");
            Scanner scanFridayPerf = new Scanner(fridayPerfomance);
            while (scanFridayPerf.hasNextLine())
            {
                String fridayPerf = scanFridayPerf.nextLine();
                System.out.println(fridayPerf);
            }
            scanFridayPerf.close();
        }
        else if (choiseDayPerfomance.equals("6"))
        {
            File saturdayPerfomance = new File("C:\\Users\\Данила\\PerfomanceWeek\\Saturday.txt");
            Scanner scanSaturdayPerf = new Scanner(saturdayPerfomance);
            while (scanSaturdayPerf.hasNextLine())
            {
                String saturdayPerf = scanSaturdayPerf.nextLine();
                System.out.println(saturdayPerf);
            }
            scanSaturdayPerf.close();
        }
        else if (choiseDayPerfomance.equals("7"))
        {
            File sundayPerfomance = new File("C:\\Users\\Данила\\PerfomanceWeek\\Sunday.txt");
            Scanner scanSundayPerf = new Scanner(sundayPerfomance);
            while (scanSundayPerf.hasNextLine())
            {
                String sundayPerf = scanSundayPerf.nextLine();
                System.out.println(sundayPerf);
            }
            scanSundayPerf.close();
        }
    }
}

