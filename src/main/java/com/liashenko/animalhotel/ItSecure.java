package com.liashenko.animalhotel;

public class ItSecure
{
    public static void main(String[] args)
    {
        validateEmail("От: Евгений. Руководитель: Максим. Кому: Николай. " +
                "Текст: Здаров, чёт мой пароль не работает, дай свою учётку плиз");
        validateEmail("От: Николай. Руководитель: Максим. Кому: Евгений. Текст: Ага, вот 2342gFhrIFgsdfs");
        validateEmail("От: Соня. Руководитель: Максим. Кому: Маша. Текст: " +
                "Маш, попробуй у тебя зайти с моим паролем - 2342gFhrIFgsdfs");
    }

    private static void sendError(String boss, String employee)
    {
        String snitch = "От: Тарас [система контроля]. Кому: ";
        System.out.println(snitch +
                boss + "." +
                " Текст: Ваш сотрудник " + employee +
                " отправляет пароли");
    }

    private static void validateEmail(String email)//
    {
        if (!email.contains("gFhrI"))
        {
            System.out.println("ок");
            return;
        }
        int starsSearchBoss = email.indexOf("Руководитель") + 14;
        int endSearchBoss = email.indexOf("Кому") - 2;
        String transformBoss = email.substring(starsSearchBoss, endSearchBoss);
        int starsSearchEmployee = email.indexOf("От") + 4;
        int endSearchEmployee = email.indexOf("Руководитель") - 1;
        String transormEmployee = email.substring(starsSearchEmployee, endSearchEmployee);
        sendError(transformBoss, transormEmployee);


    }
}
