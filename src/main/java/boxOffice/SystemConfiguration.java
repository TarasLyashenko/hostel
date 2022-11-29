package boxOffice;

import java.time.*;
import java.util.Locale;
import java.util.Scanner;


public class SystemConfiguration
{


    public void start() throws Exception
    {
        Scanner scannerComand = new Scanner(System.in);
        SaleBoxOffice saleBoxOffice = new SaleBoxOffice();
        EmployeeManagementService employeeManagementService = new EmployeeManagementService();
        SaveLoadService saveLoadService = new SaveLoadService();
        while (true){


        System.out.println("Для выбора команды введите нужную цифру,для вывода списка команд - '20'");
        int numberComand = Integer.parseInt(scannerComand.nextLine());
        if (numberComand > 22)
        {
            System.out.println("Извините, такой команды не существует, попробуйте еще раз");
            commandList();
        }
        else if (numberComand == 0)
        {
            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();
            System.out.println("Благодарим вас за использование программы,текущее время:" + "\n" + date + " " + time);
            break;
        }
        else if (numberComand == 1)
        {
            saleBoxOffice.saleTicket();

        }
        else if (numberComand == 2)
        {
            saleBoxOffice.howMutchTicket();

        }
        else if (numberComand == 3)
        {
            saleBoxOffice.showGuests();
        }
        else if (numberComand == 4)
        {
            saleBoxOffice.showMail();
        }
        else if (numberComand == 5)
        {
            saleBoxOffice.showAllPerfomance();
        }
        else if (numberComand == 6)
        {
            saleBoxOffice.addPerfomance();
        }
        else if (numberComand == 7)
        {
            employeeManagementService.addEmployee();
        }
        else if (numberComand == 8)
        {
            employeeManagementService.fastAddEmployee();
            return;
        }
        else if (numberComand == 9)
        {
            employeeManagementService.showAllEmployee();
        }
        else if (numberComand == 10)
        {
            employeeManagementService.appointEmployee();
        }
        else if (numberComand == 11)
        {
            employeeManagementService.showAllAppoint();
        }
        else if (numberComand == 12)
        {
            employeeManagementService.whereEmployeeAssigned();
        }
        else if (numberComand == 13)
        {
            employeeManagementService.like();
        }
        else if (numberComand == 14)
        {
            employeeManagementService.dislike();
        }
        else if (numberComand == 15)
        {
            employeeManagementService.showRatingActor();
        }
        else if (numberComand == 16)
        {
            employeeManagementService.showAllRating();
        }
        else if (numberComand == 17)
        {
            employeeManagementService.leaveReview();
        }
        else if (numberComand == 18)
        {
            employeeManagementService.showReviewEmployee();
        }
        else if (numberComand == 19)
        {
            employeeManagementService.showAllReview();
        }
        else if (numberComand == 20)
        {
            commandList();
        }
        else if (numberComand == 21)
        {
            saveLoadService.readMap(employeeManagementService.actorPerfomance,
                    "C:\\Users\\Данила\\actorPerfomanceMap.txt");
        }
        else if (numberComand == 22)
        {
            saveLoadService.saveMap(employeeManagementService.actorPerfomance,"C:\\Users\\Данила\\actorPerfomanceMaps.txt");
        }
        }
    }
    public void commandList()
    {
        System.out.println("1 - Купить билет" + "\n" + "2 - Cколько билетов куплено"
                + "\n" + "3 - Показать гостей" + "\n" + "4 - показать почту" + "\n"
                + "5 - показать все постановки" + "\n" +
                "6 - добавить постановку" + "\n" + "7 - добавить нового сотрудника"
                + "\n" + "8 - быстрое добавление сотрудника" + "\n"
                + "9 - показать имена всех сотрудников" + "\n" +
                "10 - назначить сотрудника" + "\n" + "11 - показать все назначения" + "\n" +
                "12 - куда назначен сотрудник" + "\n" + "13 - поставить лайк" + "\n" +
                "14 - поставить дизлайк" + "\n" + "15 - показать рейтинг сотрудника" + "\n" +
                "16 - показать рейтинг всех сотрудников" + "\n" + "17 - оставить отзыв" + "\n" +
                "18 - прочитать отзывы по сотруднику" + "\n" +
                "19 - прочитать все отзывы по сотрудникам"+ "\n" + "20 - cписок команд" + "\n"
                + "\n" +"21 - read actorPerfomance to file" + "\n" + "22 - save actorPerfomance to file");
    }
}

