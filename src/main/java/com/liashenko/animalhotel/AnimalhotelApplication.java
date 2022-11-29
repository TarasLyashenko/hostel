package com.liashenko.animalhotel;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalhotelApplication {

	public static void main(String[] args) {

		System.out.println(getPriceFromSms("Совершена покупка. Стоимость: 550 рублей"));

		System.out.println(getPriceFromSms("Совершена покупка. Стоимость: 100 рублей"));

		System.out.println(getPriceFromSms("здаров идеш бухать в 1703 сёдня"));

	}


	static int getPriceFromSms(String smsText)
	{

		int a = 1;
		int b = 0;
		if(smsText.contains("Стоимость"))
		{
			String shortVersion = smsText.substring(30,33);
			int	transformation = Integer.parseInt(shortVersion);
			return transformation;
		}
		 else
		{
			return b;
	    }

	}
	public static void sendFileToAnotherSystem(String x)
	{
		if (x.startsWith("correct"))
		{
			System.out.println("Файд успешно отправлен");
		}
		else
		{
			System.out.println("Файл нужно сначала проверить у менеджера");
		}
	}
	static boolean processfile(String y)
	{
		if (y.endsWith("exe"))
		{
			System.out.println("Мы успешно обработали файл");
			return true;
	    }
		else
		{
			System.out.println("Данный параметр файла не доступен");
			return false;
		}

	}
	static boolean calculator(String x)
	{
		int lenght = x.length();
		if (lenght < 5)
		{
			return true;

		}
		else
		{
			return false;
		}
	}

	public static int summ(String x, String y)
	{
		int sum = x.length()+y.length();
		System.out.println("Сумма чисел равна " + sum);
		return sum;
	}


	static boolean lenght(String a)
	 {
		int lenght = a.length();
		if (lenght < 120)
	    {
		System.out.println("Да,это меньше 120");
		return true;
	    }
		else
	    {
		System.out.println("Да,это больше 120");
		return false;
	    }
	}

	static boolean callculate5(int x)
	{
	    if (x > 5)
        {
		    return true;
        }
	    else
        {
		    return false;
        }
    }
	static int callculate3 (int a, int b)
	{
		if (a < b)
		{
			return (a);
		}
		else {
			return (b);
		}
	}

	public static void callculate4(int a,int b,int c,int d)
	{
		calculate2(a+b, c+d);
	}

	public static void calculate2(int x,int y)
	{
		int summ = x + y;
		System.out.println(summ);
	}

	public static void hello(String name)
	{
		String result = "Привет, " + name;
		System.out.println(result);
	}


	public static void print3(String string)
	{
		System.out.println(string);
		System.out.println(string);
		System.out.println(string);
	}


}
