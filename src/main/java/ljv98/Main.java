package ljv98;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main
{
    public static void main(String[] args)
    {
        //Создание даты и вывод на Экран
        LocalDateTime time1 = LocalDateTime.of(1997, 9, 25, 14, 40);
        LocalDateTime time2 = LocalDateTime.of(2022, 11, 18, 18, 25);
        int year1 = time1.getYear();
        int year2 = time2.getYear();
        int month1 = time1.getMonthValue();
        int month2 = time2.getMonthValue();
        int dayYear1 = time1.getDayOfMonth();
        int dayYear2 = time2.getDayOfMonth();
        int hour1 = time1.getHour();
        int hour2 = time2.getHour();
        int minute1 = time1.getMinute();
        int minute2 = time2.getMinute();
        System.out.println("Истинное первое время: " + time1);
        System.out.println("Истинное второе время: " + time2);
        System.out.println(dayYear1 + " " + month1 + " " + year1 + ". " + hour1 + ":" + minute1);
        System.out.println(dayYear2 + " " + month2 + " " + year2 + ". " + hour2 + ":" + minute2);


        //Сравнение двух дат между собой
        boolean after = time1.isAfter(time2);
        boolean before = time1.isBefore(time2);
        boolean equal = time1.equals(time2);
        System.out.println(after + " / " + before + " / " + equal);

        // Добавление
        LocalDateTime date3 = time1.plusYears(4);
        LocalDateTime date4 = time2.plusWeeks(3);
        LocalDateTime date5 = time1.plus(2, ChronoUnit.HOURS);
        System.out.println("К первому времени прибавить 4 года = " + date3);
        System.out.println("Ко второму времени прибавить 3 недели = " + date4);
        System.out.println("К первому времени прибавить 2 Хроноюнита.Часов...Это видимо 2 часа = " + date4);

        // Вычитание
        LocalDateTime date6 = time1.minusMonths(2);
        LocalDateTime date7 = time2.minusNanos(1);
        LocalDateTime date8 = time1.minus(10, ChronoUnit.SECONDS);
        System.out.println("Из первого времени вычесть 2 месяца = " + date6);
        System.out.println("Из второго времени вычесть 1 Нанос... = " + date6);
        System.out.println("Из первого времени вычесть 10 Хроноюнитных секунд...  = " + date6);

    }
}
