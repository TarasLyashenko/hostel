package com.liashenko.animalhotel;

public class Escape
{
    public static void main(String[] args)
    {
        String escapeMessage1 = "Добрый вечер, Николай . Ваша эвакуация успешно оформлена. Дата: 1 сентября 02:15. Адрес: ул. Новикова, подъезд 3. Удачи!";
        String escapeMessage2 = "Добрый день, Вячеслав . Ваша эвакуация успешно оформлена. Дата: 4 сентября 01:45. Адрес: ул. Победная, угол дома, рядом с магазином 24. Удачи!";
        String escapeMessage3 = "Доброе утро, Кирилл . Ваша эвакуация успешно оформлена. Дата: 6 сентября 00:45. Адрес: Школа 57, у заднего входа. Удачи!";

        identificationOfViolation(escapeMessage1);
        identificationOfViolation(escapeMessage2);
        identificationOfViolation(escapeMessage3);

    }

    private static void identificationOfViolation(String textMessage)
    {
        if (!textMessage.contains("эвакуация"))
        {
            return;

        }

        int startSearchName = textMessage.indexOf(",") + 2;
        int endSearchName = textMessage.indexOf("Ваша") - 2;
        String transformationName = textMessage.substring(startSearchName, endSearchName);
        int startSearchPlaceEscape = textMessage.indexOf("Дата:") + 6;
        int endSearchPlaceEscape = textMessage.indexOf("Удачи!");
        String transformationPlace = textMessage.substring(startSearchPlaceEscape, endSearchPlaceEscape);
        String alltransform = transformationName + transformationPlace;
        System.out.println(alltransform);

    }

}
