package ljv61;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListString
{
    public static void main(String[] args) throws FileNotFoundException
    {
        List<String> listString = new ArrayList<>();
        File file = new File("C:\\Files\\ListString.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            String fileLine = scanner.nextLine();
            listString.add(fileLine);
        }
        for (String string : listString)
        {
            System.out.println(string);
        }
        scanner.close();
    }
}
