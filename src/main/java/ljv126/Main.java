package ljv126;

public class Main
{
    public static void main(String[] args)
    {
//        try
//        {
//            int ageActor = 45;
//            if (ageActor >= 40)
//            {
//                throw new MyUncheckedException();
//            }
//        } catch (MyUncheckedException e)
//        {
//            System.out.println("Здарова отец");
//        }

        try
        {
            int programmerSalary = 10000;
            if (programmerSalary < 300000)
            {
                throw new MyCheckedException();
            }
        }
        catch (MyCheckedException e)
        {
            System.out.println("Кажется тут ошибка");
        }
    }
}

