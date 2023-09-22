package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random r = new Random();
        File file1 = new File("src/Day16/forDay16Task2file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        for(int i =0; i<1000;i++)
            pw1.println(r.nextInt(100));
        pw1.close();
        Scanner s = new Scanner(file1);
        File file2 = new File("src/Day16/forDay16Task2file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int sum=0;
        int counter=0;
        while(s.hasNextLine()){
            sum+=Integer.parseInt(s.nextLine());
            counter++;
            if (counter==20){
                pw2.println(sum/20.0);
                sum=0;
                counter=0;
            }
        }
        pw2.close();
        printResult(file2);
    }
    public static void printResult(File file) throws FileNotFoundException {
        File fileResult = new File("src/Day16/forDay16Task2file2.txt");
        Scanner s = new Scanner(fileResult);
        double sum = 0;
        while(s.hasNextLine())
            sum+=Double.parseDouble(s.nextLine());

        System.out.println((int)sum);
    }

}
