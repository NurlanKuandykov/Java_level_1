package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("forDay14Task1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        File file1 = new File("forDay14Task1");

        try {
            Scanner s = new Scanner(file1);
            String line = s.nextLine();
            String[] numbersInString = line.split(" ");


            if (numbersInString.length!=10)
                throw new IllegalArgumentException();

            int sum = 0;
            for(String number:numbersInString)
                sum+= Integer.parseInt(number);

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }

    }
}
