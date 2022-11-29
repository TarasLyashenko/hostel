package boxOffice;

import java.util.*;

public class EmployeeManagementService
{
    public List<Employee> employeeAdd = new ArrayList<>();
    public Scanner scannerEmployee = new Scanner(System.in);
    public Map<String, String> actorPerfomance = new HashMap<>();
    public Map<String, Integer> ratingActor = new HashMap<>();
    public Map<String, List<String>> reviewActor = new HashMap<>();

    public void showAllReview()
    {
        for (Map.Entry<String, List<String>> pair : reviewActor.entrySet())
        {
            String keyNameEmployee = pair.getKey();
            List<String> listReview = pair.getValue();
            System.out.println(keyNameEmployee + ":");
            for (String review : listReview)
            {
                System.out.println("-" + review);
            }
            System.out.println();
        }
    }

    public void showReviewEmployee()
    {
        System.out.println("по какому сотруднику нужен отзыв?");
        showAllEmployee();
        String scanNameReview = scannerEmployee.nextLine();
        List<String> listOrAllReview = reviewActor.get(scanNameReview);
        for (String review : listOrAllReview)
        {
            System.out.println("- " + review);
        }
    }

    public void leaveReview()
    {
        System.out.println("К какому сотруднику добавить отзыв?");
        showAllEmployee();
        String scannerNameReview = scannerEmployee.nextLine();
        System.out.println("Напишите отзыв к сотруднику " + "- " + scannerNameReview);
        String scannerReview = scannerEmployee.nextLine();
        List<String> listOfReviewForEmployee = reviewActor.get(scannerNameReview);
        listOfReviewForEmployee.add(scannerReview);
        System.out.println("Отзыв успешно оставлен");
    }

    public void like()
    {
        System.out.println("Кому поставить лайк?");
        showAllEmployee();
        String scanLikeName = scannerEmployee.nextLine();
        if (!employeeAdd.contains(scanLikeName))
        {
            System.out.println("Сотрудника которого вы хотите оценить не существует");
            return;
        }
        int resultValueLike = ratingActor.get(scanLikeName);
        resultValueLike++;
        ratingActor.put(scanLikeName, resultValueLike);
        System.out.println("Рейтинг успешно изменен");
    }

    public void dislike()
    {
        System.out.println("Кому поставить дизлайк?");
        showAllEmployee();
        String scanDislikeName = scannerEmployee.nextLine();
        if (!employeeAdd.contains(scanDislikeName))
        {
            System.out.println("Сотрудника которого вы хотите оценить не существует");
            return;
        }
        else if (!ratingActor.containsKey(scanDislikeName))
        {
            ratingActor.put(scanDislikeName, 0);
        }
        int resultValueDislike = ratingActor.get(scanDislikeName);
        resultValueDislike--;
        ratingActor.put(scanDislikeName, resultValueDislike);
        System.out.println("Рейтинг успешно изменен");
    }

    public void showRatingActor()
    {
        System.out.println("Какого сотрудника показать?");
        String searchActor = scannerEmployee.nextLine();
        System.out.println(ratingActor.get(searchActor));
    }

    public void showAllRating()
    {
        for (Map.Entry<String, Integer> pair : ratingActor.entrySet())
        {
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }


    public void appointEmployee()
    {
        System.out.println("Введите имя сотрудника");
        String resultScanEmployeMap = scannerEmployee.nextLine();
        System.out.println("Введите название постановки");
        String resultScanEmployePerf = scannerEmployee.nextLine();
        actorPerfomance.put(resultScanEmployeMap, resultScanEmployePerf);
        System.out.println("Успешно добавлено");
    }

    public void showAllAppoint()
    {

        for (Map.Entry<String, String> pair : actorPerfomance.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);

        }
    }

    public void whereEmployeeAssigned()
    {
        System.out.println("Введите имя сотрудника");
        String scannerActorPerfName = scannerEmployee.nextLine();
        if (!actorPerfomance.containsKey(scannerActorPerfName))
        {
            System.out.println("Сотрудник пока никуда не назначен");
        }
        else
        {
            System.out.println(actorPerfomance.get(scannerActorPerfName));
        }
    }


    public void addEmployee()
    {
        System.out.println("Напишите имя сотрудника");
        String resultScanName = scannerEmployee.nextLine();
        System.out.println("Напишите возраст сотрудника");
        int resultScanAge = Integer.parseInt(scannerEmployee.nextLine());
        System.out.println("Напишите пол сотрудника");
        String resultScanGender = scannerEmployee.nextLine();
        System.out.println("Напишите опыт работы сотрудника");
        float resultScanWork = Float.parseFloat(scannerEmployee.nextLine());
        System.out.println("Напишите должностную позицию сотрудника");
        String resultScanPosition = scannerEmployee.nextLine();
        System.out.println("Напишите номер телефона сотрудника");
        String resultScanPhone = (scannerEmployee.nextLine());
        System.out.println("Напишите номер паспорта сотрудника");
        String resultScanID = scannerEmployee.nextLine();
        System.out.println("Напишите адрес проживания сотрудника");
        String resultScanAdres = scannerEmployee.nextLine();
        ratingActor.put(resultScanName, 0);
        reviewActor.put(resultScanName, new ArrayList<>());


        Employee employee = new Employee(resultScanName, resultScanAge, resultScanGender, resultScanWork,
                resultScanPosition, resultScanPhone, resultScanID, resultScanAdres);
        employeeAdd.add(employee);
        System.out.println("Сотрудник добавлен");
    }

    public void showAllEmployee()
    {
        for (Employee employee : employeeAdd)
        {
            System.out.println(employee.fullName);
        }
    }

    public void fastAddEmployee()
    {
        System.out.println("Напишите имя сотрудника");
        String resultScanName = scannerEmployee.nextLine();
        ratingActor.put(resultScanName, 0);
        reviewActor.put(resultScanName, new ArrayList<>());


        Employee employee = new Employee(resultScanName);
        employeeAdd.add(employee);
        System.out.println("Сотрудник добавлен");
    }
}
