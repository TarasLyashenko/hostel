package ljv65.service;


import ljv65.model.Perfomance;
import ljv65.sorting.PerfomancebyPriceComparator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TheaterService
{
    private static final String PERFOMANCE_FILE_NAME = "C:\\Perfomance\\Perfomance.txt";

    private List<Perfomance> perfomances = new ArrayList();
    private Scanner scanPerfomance = new Scanner(System.in);

    public void addPerfomance()
    {
        System.out.println("Введите название постановки");
        String title = scanPerfomance.nextLine();
        System.out.println("Введите цену");
        int price = Integer.parseInt(scanPerfomance.nextLine());
        System.out.println("Введите художественного руководителя");
        String artistDirector = scanPerfomance.nextLine();
        System.out.println("Введите продлжительность");
        double duration = Double.parseDouble(scanPerfomance.nextLine());
        System.out.println("Введите город");
        String city = scanPerfomance.nextLine();
        System.out.println("Введите краткое описание");
        String shortDescription = scanPerfomance.nextLine();
        Perfomance newPerfomance = new Perfomance(title, price, artistDirector, duration, city, shortDescription);
        perfomances.add(newPerfomance);
        System.out.println("Постановка успешно добавлена.");
    }

    public void showAllPefomance(Comparator<Perfomance> comparator)
    {
        int numberPerfomance = 0;

        Collections.sort(perfomances, comparator);
        for (Perfomance showAllPerfomance : perfomances)
        {
            System.out.println(numberPerfomance + " " + showAllPerfomance.title
                    + "\n" + showAllPerfomance.price + " рублей" +
                    "\n" + "Худ. рук: " + showAllPerfomance.artisticDirector +
                    "\n" + "Продолжительность (час.): " +
                    showAllPerfomance.duration + "\n" + "Город: " +
                    showAllPerfomance.city + "\n");
            numberPerfomance++;
        }
    }

    public void loadPerfomances() throws FileNotFoundException
    {
        File file = new File(PERFOMANCE_FILE_NAME);
        Scanner scanFile = new Scanner(file);
        while (scanFile.hasNextLine())
        {
            String fileLine = scanFile.nextLine();
            String[] cutLine = fileLine.split(";");
            String title = cutLine[0];
            int price = Integer.parseInt(cutLine[1]);
            String artistDirector = cutLine[2];
            double duration = Double.parseDouble(cutLine[3]);
            String city = cutLine[4];
            String shortDescription = cutLine[5];
            Perfomance perfomance = new Perfomance(title, price, artistDirector, duration, city, shortDescription);
            perfomances.add(perfomance);
        }
    }

    public void removePerfomance()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это все созданные постановки: \n");
        showAllPefomance(new PerfomancebyPriceComparator());
        System.out.println("Введите цифру какую по счету постановку вы хотите удалить.");
        int choiceRemove = Integer.parseInt(scanner.nextLine());
        perfomances.remove(choiceRemove);
        System.out.println("Постановка успешно удалена.\nВот список оставшихся:\n");
        showAllPefomance(new PerfomancebyPriceComparator());
    }

    public void exitPerfomance() throws IOException
    {
        FileWriter fileWriter = new FileWriter(PERFOMANCE_FILE_NAME);
        for (Perfomance writePerfomance : perfomances)
        {
            fileWriter.write(writePerfomance.title + ";" + writePerfomance.price + ";" +
                    writePerfomance.artisticDirector + ";" +
                    writePerfomance.duration + ";" + writePerfomance.city + ";" + writePerfomance.shortDescription + "\n");
        }
        fileWriter.close();
        System.out.println("Хорошего вам дня");
    }
}
