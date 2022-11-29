
package bank;


import java.util.Scanner;

public class CashMachine
{
    public int amountRub;
    public int amountUsd;
    Scanner programScan = new Scanner(System.in);

    public void cashIn()
    {

        System.out.println("Сколько внести?");
        int resultDepositIn = Integer.parseInt(programScan.nextLine());
        System.out.println("В какой валюте?");
        String resultDepositСurrencyIn = (programScan.nextLine());
        if (resultDepositСurrencyIn.equals("rub"))
        {
            amountRub = amountRub + resultDepositIn;
            System.out.println("Счет пополнен, текущий остаток:" + (amountRub) + " рублей");
        }
        else if (resultDepositСurrencyIn.contains("usd"))
        {
            amountUsd = amountUsd + resultDepositIn;
            System.out.println("Счет пополнен, текущий остаток:" + (amountUsd) + " долларов");
        }

    }

    public void cashOut()
    {
        System.out.println("Сколько списать?");
        int resultDepositOut = Integer.parseInt(programScan.nextLine());
        System.out.println("В какой валюте?");
        String resultDepositСurrencyOut = (programScan.nextLine());
        if (resultDepositСurrencyOut.equals("rub"))
        {
            amountRub = amountRub - resultDepositOut;
            System.out.println("Списани выполнено, текущий остаток:" + (amountRub) + " рублей");
        }
        else if (resultDepositСurrencyOut.contains("usd"))
        {
            amountUsd = amountUsd - resultDepositOut;
            System.out.println("Списание выполнено, текущий остаток:" + (amountUsd) + " долларов");
        }


    }

    public void printCurrentAmount()
    {

        System.out.println("Текущий остаток:" + amountRub + " рублей," + amountUsd + " долларов.");

    }

    public void exit()
    {
        System.out.println("Благодарим за использование нашего сервиса, хорошего вам дня.");

    }
}

