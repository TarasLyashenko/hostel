package ljv65.service;

import ljv65.model.Actor;
import ljv65.sorting.ActorByAgeComparator;
import ljv65.sorting.ActorByNameComparator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ActorService
{
    private static final String ACTOR_FILE_NAME = "C:\\Perfomance\\Actor.txt";

    private List<Actor> actors = new ArrayList();
    private Scanner scanActor = new Scanner(System.in);

    public void addActor()
    {

        System.out.println("Введите имя актера");
        String name = scanActor.nextLine();
        System.out.println("Ведите фамилию");
        String surname = scanActor.nextLine();
        System.out.println("Введите отчество");
        String middleName = scanActor.nextLine();
        System.out.println("Введите номер телефона начиная с +7");
        String phoneNumber = scanActor.nextLine();
        System.out.println("Введите номер паспорта");
        String pasportNumber = scanActor.nextLine();
        System.out.println("Введите возраст");
        int age = Integer.parseInt(scanActor.nextLine());
        System.out.println("Введите опыт работы в месяцах");
        int workExperience = Integer.parseInt(scanActor.nextLine());
        System.out.println("Введите должность");
        String position = scanActor.nextLine();
        Actor newActor = new Actor(name, surname, middleName, phoneNumber, pasportNumber, age, workExperience, position);
        actors.add(newActor);
        System.out.println("Актер успешно добавлен.");
    }

    public void showAllActor(Comparator<Actor> comparator)
    {
        int numberActor = 0;
        Collections.sort(actors, comparator);
        for (Actor showAllActors : actors)
        {
            System.out.println(numberActor + " " + showAllActors.middleName
                    + " " + showAllActors.name + " " + showAllActors.surname
                    + "\n" + "Возраст: " + showAllActors.age + "\n" + "Телефон: " +
                    showAllActors.phoneNumber + "\n"
                    + "Паспорт: " + showAllActors.pasportNumber + "\n"
                    + "Опыт работы (мес.): " + showAllActors.workExperience +
                    "\n" + "Должность: " + showAllActors.position + "\n");
            numberActor++;
        }
    }

    public void removeActor()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это все актеры: \n");
        showAllActor(new ActorByAgeComparator());
        System.out.println("Введите цифру какого по счету актера вы хотите удалить.");
        int choiceRemove = Integer.parseInt(scanner.nextLine());
        actors.remove(choiceRemove);
        System.out.println("Актер успешно удален.\nВот список оставшихся:\n");
        showAllActor(new ActorByAgeComparator());
    }

    public void exitActor() throws IOException
    {
        FileWriter fileWriter = new FileWriter(ACTOR_FILE_NAME);
        for (Actor writeActor : actors)
        {
            fileWriter.write(writeActor.name + ";" + writeActor.surname
                    + ";" + writeActor.middleName + ";" + writeActor.phoneNumber
                    + ";" + writeActor.pasportNumber + ";" + writeActor.age + ";" +
                    writeActor.workExperience + ";" + writeActor.position + "\n");
        }
        fileWriter.close();
    }

    public void loadActors() throws FileNotFoundException
    {
        File file = new File(ACTOR_FILE_NAME);
        Scanner scanActor = new Scanner(file);
        while (scanActor.hasNextLine())
        {
            String fileLine = scanActor.nextLine();
            String[] cutLine = fileLine.split(";");
            String name = cutLine[0];
            String surname = cutLine[1];
            String middleName = cutLine[2];
            String phoneNumber = cutLine[3];
            String pasportNumber = cutLine[4];
            int age = Integer.parseInt(cutLine[5]);
            int workExperience = Integer.parseInt(cutLine[6]);
            String position = cutLine[7];
            Actor actor = new Actor(name, surname, middleName,
                    phoneNumber, pasportNumber, age, workExperience, position);
            actors.add(actor);
        }
    }


}
