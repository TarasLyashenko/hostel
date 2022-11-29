package Time.service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class TimeService
{
    public static final String MY_CONSTANT_FILE = "C:\\TimeToCoding\\TimeCoding.txt";

    public void closeIdea() throws IOException
    {

        FileWriter fileWriterStartTime = new FileWriter(MY_CONSTANT_FILE, true);
        LocalDateTime time2 = LocalDateTime.now();
        int hour2 = time2.getHour();
        int minute2 = time2.getMinute();
        fileWriterStartTime.write("\nСегодня вы закончили програмировать в: " + hour2 + " " + minute2);
        System.out.println("Время окончания успешно записано, хорошего отдыха!");
        fileWriterStartTime.close();
        System.exit(0);
    }

    public void startIdea() throws IOException
    {
        FileWriter fileWriterStartTime = new FileWriter(MY_CONSTANT_FILE);
        LocalDateTime time1 = LocalDateTime.now();
        int hour1 = time1.getHour();
        int minute1 = time1.getMinute();
        fileWriterStartTime.write("Сегодня вы начали програмировать в: " + hour1 + " " + minute1);
        fileWriterStartTime.close();
        System.out.println("Время начала успешно записано, хорошего програмирования!");
        fileWriterStartTime.close();
        System.exit(0);
    }
}

