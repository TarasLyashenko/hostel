package infinity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        List<String> curseWord = new ArrayList<>();
        System.out.println("Приветствую! Начинайте вводить сообщения, я их запишу!");
        while (true)
        {
            Scanner programScan = new Scanner(System.in);
            String resultScan = programScan.nextLine();
            if (resultScan.equals("выход"))
            {
                System.out.println("Вывожу все ваши сообщения:");
                FileWriter curseWords = new FileWriter("C:\\Users\\Данила\\CurseWords.txt");
                for (String result : curseWord)
                {
                    if (result.contains("хуй"))
                    {
                        curseWords.write(result + "\n");
                    }
                    else if (result.contains("блять"))
                    {
                        curseWords.write(result + "\n");
                    }
                    System.out.println("- " + result);
                }
                curseWords.close();
                return;
            }
            else
            {
                curseWord.add(resultScan);
            }

        }
    }
}
