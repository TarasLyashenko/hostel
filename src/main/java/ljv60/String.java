package ljv60;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String
{
    public static void main(java.lang.String[] args) throws FileNotFoundException
    {
        File createString = new File("C:\\Files\\String.txt");
        Scanner scanString = new Scanner(createString);
        while (scanString.hasNextLine())
        {
            java.lang.String readString = scanString.nextLine();
            System.out.println(readString);
        }
        scanString.close();

    }
}
