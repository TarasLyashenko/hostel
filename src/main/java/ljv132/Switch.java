package ljv132;

import java.util.ArrayList;
import java.util.List;

public class Switch
{
    public static void main(String[] args)
    {
        int salary = 18000;

        switch (salary)
        {
            case 50000 : System.out.println("So...it's bad bro");
            break;
            case 100000 : System.out.println("Hm, yes it's fine");
            break;
            case 150000 : System.out.println("It's very fine!");
            break;
            case 200000 : System.out.println("*Emigration sound*");
            break;
            case 300000 : System.out.println("*Food delivery sound*");
            break;
            default: System.out.println("Hello, are you in Izhevsk?");
        }
    }
}
