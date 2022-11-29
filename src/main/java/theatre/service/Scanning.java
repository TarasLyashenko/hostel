package theatre.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Scanning
{
    public PerfomanceService perfomanceService;
    public List<String> perfomanceToday = new ArrayList<>();
    public List<String> actorsOnThisDay = new ArrayList<>();
    public List<String> dayOfWeek = new ArrayList<>();

    public void readMonday() throws FileNotFoundException
    {
        File monday = new File("C:\\Users\\Данила\\Actorweek\\Monday.txt");
        Scanner mondayScan = new Scanner(monday);
        while (mondayScan.hasNextLine())
        {
            String mondays = mondayScan.nextLine();
            actorsOnThisDay.add(mondays);
            System.out.println(mondays);
        }
        mondayScan.close();
    }

    public void readTuesday() throws FileNotFoundException
    {
        File tuesday = new File("C:\\Users\\Данила\\Actorweek\\Tuesday.txt");
        Scanner tuesdayScan = new Scanner(tuesday);
        while (tuesdayScan.hasNextLine())
        {
            String tuesdays = tuesdayScan.nextLine();
            actorsOnThisDay.add(tuesdays);
            System.out.println(tuesdays);
        }
        tuesdayScan.close();
    }

    public void readWednesday() throws FileNotFoundException
    {
        File wednesday = new File("C:\\Users\\Данила\\Actorweek\\Wednesday.txt");
        Scanner wednesdayScan = new Scanner(wednesday);
        while (wednesdayScan.hasNextLine())
        {
            String wednesdays = wednesdayScan.nextLine();
            actorsOnThisDay.add(wednesdays);
            System.out.println(wednesdays);
        }
        wednesdayScan.close();
    }

    public void readThursday() throws FileNotFoundException
    {
        File thursday = new File("C:\\Users\\Данила\\Actorweek\\Thursday.txt");
        Scanner thursdayScan = new Scanner(thursday);
        while (thursdayScan.hasNextLine())
        {
            String thursdays = thursdayScan.nextLine();
            actorsOnThisDay.add(thursdays);
            System.out.println(thursdays);
        }
        thursdayScan.close();
    }

    public void readFriday() throws FileNotFoundException
    {
        File friday = new File("C:\\Users\\Данила\\Actorweek\\Friday.txt");
        Scanner fridayScan = new Scanner(friday);
        while (fridayScan.hasNextLine())
        {
            String fridays = fridayScan.nextLine();
            actorsOnThisDay.add(fridays);
            System.out.println(fridays);
        }
        fridayScan.close();
    }

    public void readSaturday() throws FileNotFoundException
    {
        File saturday = new File("C:\\Users\\Данила\\Actorweek\\Saturday.txt");
        Scanner saturdayScan = new Scanner(saturday);
        while (saturdayScan.hasNextLine())
        {
            String saturdays = saturdayScan.nextLine();
            actorsOnThisDay.add(saturdays);
            System.out.println(saturdays);
        }
        saturdayScan.close();
    }

    public void readSunday() throws FileNotFoundException
    {
        File sunday = new File("C:\\Users\\Данила\\Actorweek\\Sunday.txt");
        Scanner sundayScan = new Scanner(sunday);
        while (sundayScan.hasNextLine())
        {
            String sundays = sundayScan.nextLine();
            actorsOnThisDay.add(sundays);
            System.out.println(sundays);
        }
        sundayScan.close();
    }

    public int dayWeek() throws IOException
    {
        System.out.println("Сегодня день недели: ");
        Calendar today = Calendar.getInstance();
        Integer dayOfWeeks = today.get(Calendar.DAY_OF_WEEK);
        int todays = dayOfWeeks - 1;
        if (todays == 1)
        {
            String mondayDay = "Понедельник \n";
            dayOfWeek.add(mondayDay);
            System.out.println(mondayDay);
        }
        else if (todays == 2)
        {
            String tuesday = "Вторник \n";
            dayOfWeek.add(tuesday);
            System.out.println(tuesday);
        }
        else if (todays == 3)
        {
            String wednesday = "Среда \n";
            dayOfWeek.add(wednesday);
            System.out.println(wednesday);
        }
        else if (todays == 4)
        {
            String thursday = "Четверг \n";
            dayOfWeek.add(thursday);
            System.out.println(thursday);
        }
        else if (todays == 5)
        {
            String friday = "Пятница \n";
            dayOfWeek.add(friday);
            System.out.println(friday);
        }
        else if (todays == 6)
        {
            String saturday = "Суббота \n";
            dayOfWeek.add(saturday);
            System.out.println(saturday);
        }
        else if (todays == 7)
        {
            String sunday = "Воскресенье \n";
            dayOfWeek.add(sunday);
            System.out.println(sunday);
        }
        return dayOfWeeks;
    }


    public void whoWorks() throws IOException
    {
        Scanner scannerDay = new Scanner(System.in);
        System.out.println("Состав на какой день недели вам нужен? Введите число от 1 до 7");
        String dayScanner = scannerDay.nextLine();
        if (dayScanner.equals("1"))
        {
            System.out.println("В понедельник работают:\n");
            readMonday();
            System.out.println("\nДобавить их к постановке? Введите - да или нет.");
            String choiceYesorNot = scannerDay.nextLine();
            if (choiceYesorNot.equals("да"))
            {
                perfomanceService.showAllPerfomance();
                System.out.println("Введите название нужной вам постановки");
                String perfomanceMondayName = scannerDay.nextLine();
                System.out.println("Введите цену постановки");
                String perfomanceMondayPrice = scannerDay.nextLine();
                System.out.println("Введите афишу постановки");
                String postersMonday = scannerDay.nextLine();
                FileWriter writerMonday = new FileWriter("C:\\Users\\Данила\\PerfomanceWeek\\Monday.txt");
                writerMonday.write("Постановка:" + perfomanceMondayName +
                        ", цена:" + perfomanceMondayPrice + ", афиша:" + postersMonday + "\n \n");
                writerMonday.write("Актерский состав на сегодня: \n");
                for (String actorMonday : actorsOnThisDay)
                {
                    writerMonday.write(actorMonday + "\n");
                }
                System.out.println("Успешно добавлено");
                writerMonday.close();
            }
            else if (choiceYesorNot.equals("нет"))
            {
                System.out.println("Введите номер нужной вам команды");
            }


        }
        else if (dayScanner.equals("2"))
        {
            System.out.println("Во вторник работают:\n");
            readTuesday();
            System.out.println("\nДобавить их к постановке? Введите - да или нет.");
            String choiceYesorNot = scannerDay.nextLine();
            if (choiceYesorNot.equals("да"))
            {
                perfomanceService.showAllPerfomance();
                System.out.println("Введите название нужной вам постановки");
                String perfomanceTuesdayName = scannerDay.nextLine();
                System.out.println("Введите цену постановки");
                String perfomanceTuesdayPrice = scannerDay.nextLine();
                System.out.println("Введите афишу постановки");
                String postersTuesday = scannerDay.nextLine();
                FileWriter writerTuesday = new FileWriter("C:\\Users\\Данила\\PerfomanceWeek\\Tuesday.txt");
                writerTuesday.write("Постановка:" + perfomanceTuesdayName +
                        ", цена:" + perfomanceTuesdayPrice + ", афиша:" + postersTuesday + "\n \n");
                writerTuesday.write("Актерский состав на сегодня: \n");
                for (String actorTuesday : actorsOnThisDay)
                {
                    writerTuesday.write(actorTuesday + "\n");
                }
                System.out.println("Успешно добавлено");
                writerTuesday.close();
            }
            else if (choiceYesorNot.equals("нет"))
            {
                System.out.println("Введите номер нужной вам команды");
            }

        }

        else if (dayScanner.equals("3"))
        {
            System.out.println("В среду работают:\n");
            readWednesday();
            System.out.println("\nДобавить их к постановке? Введите - да или нет.");
            String choiceYesorNot = scannerDay.nextLine();
            if (choiceYesorNot.equals("да"))
            {
                perfomanceService.showAllPerfomance();
                System.out.println("Введите название нужной вам постановки");
                String perfomanceWednesdayName = scannerDay.nextLine();
                System.out.println("Введите цену постановки");
                String perfomanceWednesdayPrice = scannerDay.nextLine();
                System.out.println("Введите афишу постановки");
                String postersWednesday = scannerDay.nextLine();
                FileWriter writerWednesday = new FileWriter("C:\\Users\\Данила\\PerfomanceWeek\\Wednesday.txt");
                writerWednesday.write("Постановка:" + perfomanceWednesdayName +
                        ", цена:" + perfomanceWednesdayPrice + ", афиша:" + postersWednesday + "\n \n");
                writerWednesday.write("Актерский состав на сегодня: \n");
                for (String actorWednesday : actorsOnThisDay)
                {
                    writerWednesday.write(actorWednesday + "\n");
                }
                System.out.println("Успешно добавлено");
                writerWednesday.close();
            }
            else if (choiceYesorNot.equals("нет"))
            {
                System.out.println("Введите номер нужной вам команды");
            }

        }
        else if (dayScanner.equals("4"))
        {
            System.out.println("В четверг работают:\n");
            readThursday();
            System.out.println("\nДобавить их к постановке? Введите - да или нет.");
            String choiceYesorNot = scannerDay.nextLine();
            if (choiceYesorNot.equals("да"))
            {
                perfomanceService.showAllPerfomance();
                System.out.println("Введите название нужной вам постановки");
                String perfomanceThursdayName = scannerDay.nextLine();
                System.out.println("Введите цену постановки");
                String perfomanceThursdayPrice = scannerDay.nextLine();
                System.out.println("Введите афишу постановки");
                String postersThursday = scannerDay.nextLine();
                FileWriter writerThursday = new FileWriter("C:\\Users\\Данила\\PerfomanceWeek\\Thursday.txt");
                writerThursday.write("Постановка:" + perfomanceThursdayName +
                        ", цена:" + perfomanceThursdayPrice + ", афиша:" + postersThursday + "\n \n");
                writerThursday.write("Актерский состав на сегодня: \n");
                for (String actorThursday : actorsOnThisDay)
                {
                    writerThursday.write(actorThursday + "\n");
                }
                System.out.println("Успешно добавлено");
                writerThursday.close();
            }
            else if (choiceYesorNot.equals("нет"))
            {
                System.out.println("Введите номер нужной вам команды");
            }

        }
        else if (dayScanner.equals("5"))
        {
            System.out.println("В пятницу работают:\n");
            readFriday();
            System.out.println("\nДобавить их к постановке? Введите - да или нет.");
            String choiceYesorNot = scannerDay.nextLine();
            if (choiceYesorNot.equals("да"))
            {
                perfomanceService.showAllPerfomance();
                System.out.println("Введите название нужной вам постановки");
                String perfomanceFridayName = scannerDay.nextLine();
                System.out.println("Введите цену постановки");
                String perfomanceFridayPrice = scannerDay.nextLine();
                System.out.println("Введите афишу постановки");
                String postersFriday = scannerDay.nextLine();
                FileWriter writerFriday = new FileWriter("C:\\Users\\Данила\\PerfomanceWeek\\Friday.txt");
                writerFriday.write("Постановка:" + perfomanceFridayName +
                        ", цена:" + perfomanceFridayPrice + ", афиша:" + postersFriday + "\n \n");
                writerFriday.write("Актерский состав на сегодня: \n");
                for (String actorFriday : actorsOnThisDay)
                {
                    writerFriday.write(actorFriday + "\n");
                }
                System.out.println("Успешно добавлено");
                writerFriday.close();
            }
            else if (choiceYesorNot.equals("нет"))
            {
                System.out.println("Введите номер нужной вам команды");
            }

        }
        else if (dayScanner.equals("6"))
        {
            System.out.println("Сегодня работают:");
            readSaturday();
            System.out.println("\nДобавить их к постановке? Введите - да или нет.");
            String choiceYesorNot = scannerDay.nextLine();
            if (choiceYesorNot.equals("да"))
            {
                perfomanceService.showAllPerfomance();
                System.out.println("Введите название нужной вам постановки");
                String perfomanceSaturdayName = scannerDay.nextLine();
                System.out.println("Введите цену постановки");
                String perfomanceSaturdayPrice = scannerDay.nextLine();
                System.out.println("Введите афишу постановки");
                String postersSaturday = scannerDay.nextLine();
                FileWriter writerSaturday = new FileWriter("C:\\Users\\Данила\\PerfomanceWeek\\Saturday.txt");
                writerSaturday.write("Постановка:" + perfomanceSaturdayName +
                        ", цена:" + perfomanceSaturdayPrice + ", афиша:" + postersSaturday + "\n \n");
                writerSaturday.write("Актерский состав на сегодня: \n");
                for (String actorSaturday : actorsOnThisDay)
                {
                    writerSaturday.write(actorSaturday + "\n");
                }
                System.out.println("Успешно добавлено");
                writerSaturday.close();
            }
            else if (choiceYesorNot.equals("нет"))
            {
                System.out.println("Введите номер нужной вам команды");
            }

        }
        else if (dayScanner.equals("7"))
        {
            System.out.println("В воскресенье работают:\n");
            readSunday();
            System.out.println("\nДобавить их к постановке? Введите - да или нет.");
            String choiceYesorNot = scannerDay.nextLine();
            if (choiceYesorNot.equals("да"))
            {
                perfomanceService.showAllPerfomance();
                System.out.println("Введите название нужной вам постановки");
                String perfomanceSundayName = scannerDay.nextLine();
                System.out.println("Введите цену постановки");
                String perfomanceSundayPrice = scannerDay.nextLine();
                System.out.println("Введите афишу постановки");
                String postersSunday = scannerDay.nextLine();
                FileWriter writerSunday = new FileWriter("C:\\Users\\Данила\\PerfomanceWeek\\Sunday.txt");
                writerSunday.write("Постановка:" + perfomanceSundayName +
                        ", цена:" + perfomanceSundayPrice + ", афиша:" + postersSunday + "\n \n");
                writerSunday.write("Актерский состав на сегодня: \n");
                for (String actorSunday: actorsOnThisDay)
                {
                    writerSunday.write(actorSunday + "\n");
                }
                System.out.println("Успешно добавлено");
                writerSunday.close();
            }
            else if (choiceYesorNot.equals("нет"))
            {
                System.out.println("Введите номер нужной вам команды");
            }

        }

    }

}

