package boxOffice;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class SaveLoadService
{
    public void readMap(Map<String, String> mapWrite, String fileName) throws Exception
    {
        File fileMapPerfomance = new File("C:\\Users\\Данила\\actorPerfomanceMap.txt");
        Scanner scannerMap = new Scanner(fileMapPerfomance);
        while (scannerMap.hasNextLine())
        {
            for (Map.Entry entry : mapWrite.entrySet())
            {
                System.out.println(entry.getKey());
            }
        }
        scannerMap.close();
    }

    public void saveMap(Map<String, String> mapWrite, String fileName) throws IOException
    {
        FileWriter writer = new FileWriter("C:\\Users\\Данила\\actorPerfomanceMaps.txt");
        writer.write(mapWrite.toString());
        writer.close();
    }
}

