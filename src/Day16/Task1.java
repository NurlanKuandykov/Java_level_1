package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/Day16/forDay16Task1");
        printResult(file);
    }
    public static void printResult(File file){
        File file1 = new File("src/Day16/forDay16Task1");

        try {
            Scanner s = new Scanner(file1);
            String line = s.nextLine();
            String[] numbers = line.split(" ");

            int sum = 0;
            for(String number:numbers) {
                sum += Integer.parseInt(number);
            }
            double result = sum/(double)numbers.length;
            System.out.printf(result + "--> %.3f",result);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }

    }
}
