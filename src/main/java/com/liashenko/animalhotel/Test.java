package com.liashenko.animalhotel;

public class Test
{
    public static void main(String[] args)
    {
        String message1 = "Город: Дубай. Покупка. Потрачено 254 рублей.";
        String message2 = "Город: Ижевск. Покупка. Потрачено 43 рублей.";
        String message3 = "Город: Питер. Покупка. Потрачено 345454 рублей.";
        String message4 = "здаров идеш бухать в 1703 сёдня";

        int priceFromSMS1 = getPriceFromSMS(message1);
        int priceFromSMS2 = getPriceFromSMS(message2);
        int priceFromSMS3 = getPriceFromSMS(message3);
        int priceFromSMS4 = getPriceFromSMS(message4);

        analyzePrice(priceFromSMS1);
        analyzePrice(priceFromSMS2);
        analyzePrice(priceFromSMS3);
        analyzePrice(priceFromSMS4);
    }

    private static int getPriceFromSMS(String textSms)
    {
        if (!textSms.contains("Потрачено"))
        {
            return 0;
        }

        int startPrice = textSms.indexOf("Потрачено") + 10;
        int endPrice = textSms.indexOf(" рублей");

        String transformation = textSms.substring(startPrice, endPrice);
        return Integer.parseInt(transformation);
    }

    private static void analyzePrice(int smsSum)
    {
        if (smsSum >= 1000)
        {
            System.out.println("You are ohuel?...");
        } else if (smsSum == 0)
        {
            System.out.println("Nothing");
        } else
        {
            System.out.println("ok.");
        }
    }

}




