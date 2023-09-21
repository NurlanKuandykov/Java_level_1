package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //File file = new File("people.txt");
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File file1 = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner s = new Scanner(file1);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                people.add(line);

                String[] person = line.split(" ");
                int age = Integer.parseInt(person[1]);
                if (age < 0)
                    throw new IllegalArgumentException();
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
