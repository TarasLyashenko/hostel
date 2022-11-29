package ljv100;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd MMMM yyyy");
        Date date1 = new Date();
        System.out.println("Первый способ: " + dateFormat1.format(date1));

        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd MMM yy");
        Date date2 = new Date();
        System.out.println("Второй способ: " + dateFormat2.format(date2));

        SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd MMMM yyyy. EEEE");
        Date date3 = new Date();
        System.out.println("Третий способ: " + dateFormat3.format(date3));
    }
}
