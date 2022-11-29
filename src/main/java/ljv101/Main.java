package ljv101;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        Date parseDate = format.parse("12 Февраль 2022");


        SimpleDateFormat format2 = new SimpleDateFormat("dd MMM yy");
        String stringDate2 = "12 фев 22";
        Date parseDate2 = format.parse(stringDate2);


        SimpleDateFormat format3 = new SimpleDateFormat("dd MMMM yyyy. EEEE");
        String stringDate3 = "12 Февраль 2022. Вторник";
        Date parseDate3 = format.parse(stringDate3);
    }
}
