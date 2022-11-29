package boxOffice;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {

        SaleBoxOffice saleBoxOffice = new SaleBoxOffice();
        EmployeeManagementService employeeManagementService = new EmployeeManagementService();
        SystemConfiguration systemConfiguration = new SystemConfiguration();
        SaveLoadService saveLoadService = new SaveLoadService();

        System.out.println("Здравствуйте это программа управление Театром, " +
                "для началы работы программы напишите 'запуск'");
        while (true)
        {
            Scanner programScan = new Scanner(System.in);
            String resultScan = programScan.nextLine();
            if (resultScan.contains("выход"))
            {
                System.out.println("Спасибо за использование нашего сервиса.");
                break;
            }
            else if (resultScan.equals("запуск"))
            {
            systemConfiguration.start();
            }
            else if (resultScan.equals("сколько билетов куплено"))
            {
                saleBoxOffice.howMutchTicket();
            }
            else if (resultScan.equals("купить билет"))
            {

                saleBoxOffice.saleTicket();
            }
            else if (resultScan.equals("показать гостей"))
            {
                saleBoxOffice.showGuests();
            }
            else if (resultScan.equals("показать почту"))
            {
                saleBoxOffice.showMail();
            }
            else if (resultScan.equals("показать все постановки"))
            {
                saleBoxOffice.showAllPerfomance();
            }
            else if (resultScan.equals("добавить постановку"))
            {
                saleBoxOffice.addPerfomance();
            }
            else if (resultScan.contains("добавить нового сотрудника"))
            {
                employeeManagementService.addEmployee();
            }
            else if (resultScan.contains("быстрое добавление сотрудника"))
            {
                employeeManagementService.fastAddEmployee();
            }
            else if (resultScan.contains("показать имена всех сотрудников"))
            {
                employeeManagementService.showAllEmployee();
            }
            else if (resultScan.contains("назначить сотрудника"))
            {
                employeeManagementService.appointEmployee();
            }
            else if (resultScan.contains("показать все назначения"))
            {
                employeeManagementService.showAllAppoint();
            }
            else if (resultScan.contains("куда назначен сотрудник"))
            {
                employeeManagementService.whereEmployeeAssigned();
            }
            else if (resultScan.contains("поставить лайк"))
            {
                employeeManagementService.like();
            }
            else if (resultScan.contains("поставить дизлайк"))
            {
                employeeManagementService.dislike();
            }
            else if (resultScan.contains("показать рейтинг сотрудника"))
            {
                employeeManagementService.showRatingActor();
            }
            else if (resultScan.contains("показать рейтинг всех сотрудников"))
            {
                employeeManagementService.showAllRating();
            }
            else if (resultScan.contains("оставить отзыв"))
            {
                employeeManagementService.leaveReview();
            }
            else if (resultScan.contains("прочитать отзывы по сотруднику"))
            {
                employeeManagementService.showReviewEmployee();
            }
            else if (resultScan.contains("прочитать все отзывы по сотрудникам"))
            {
                employeeManagementService.showAllReview();
            }
            else if (resultScan.contains("список команд"))
            {
                systemConfiguration.commandList();
            }
            else if (resultScan.contains("read actorPerfomance to file"))
            {
                saveLoadService.readMap(employeeManagementService.actorPerfomance,
                        "C:\\Users\\Данила\\actorPerfomanceMap.txt");
            }
            else if (resultScan.contains("save actorPerfomance to file"))
            {
                saveLoadService.saveMap(employeeManagementService.actorPerfomance,
                        "C:\\Users\\Данила\\actorPerfomanceMaps.txt");
            }

        }
    }
}