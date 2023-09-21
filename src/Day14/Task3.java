package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }
    public static List<Person> parseFileToObjList() {
        File file1 = new File("people.txt");
        List<Person> people = new ArrayList<>();
        try {
            Scanner s = new Scanner(file1);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] person = line.split(" ");
                Person currentPerson = new Person(person[0],Integer.parseInt(person[1]));

                int age = Integer.parseInt(person[1]);
                if (age < 0)
                    throw new IllegalArgumentException();
                people.add(currentPerson);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
