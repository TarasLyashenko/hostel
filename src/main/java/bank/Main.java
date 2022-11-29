package bank;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        CashMachine cashMachine = new CashMachine();
        cashMachine.amountRub = 0;
        cashMachine.amountUsd = 0;
        Scanner programScan = new Scanner(System.in);


        {
            while (true)
            {
                String resultScan = programScan.nextLine();

                if (resultScan.contains("выход"))
                {
                    cashMachine.exit();

                    break;
                }

                else if (resultScan.equals("пополнить счет"))
                {

                    cashMachine.cashIn();

                }
                else if (resultScan.equals("списание"))
                {

                    cashMachine.cashOut();

                }
                else if (resultScan.equals("проверить остаток"))
                {
                    cashMachine.printCurrentAmount();

                }

            }
        }
    }
}
