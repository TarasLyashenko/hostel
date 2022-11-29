package ljv99;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();

        System.out.println(dateFormat.format(date));
    }

}
