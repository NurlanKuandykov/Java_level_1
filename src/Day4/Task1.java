package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random number - the size of the array");
        int n = sc.nextInt();
        int[] x = new int[n];
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        for (int i = 0; i<x.length; i++){
            Random r = new Random();
            x[i] = r.nextInt(10);
            if (x[i] > 8) ++a1;
            if (x[i] == 1) ++a2;
            if (x[i] % 2 == 0 && x[i] != 0) ++a3;
            if (x[i] % 2 != 0) ++a4;
            a5+=x[i];
        }
        System.out.println(Arrays.toString(x));
        System.out.println("Array length: " + n);
        System.out.println("The number of numbers is greater than 8: " + a1);
        System.out.println("The number of numbers equals to 1: " + a2);
        System.out.println("Number of even numbers: " + a3);
        System.out.println("Number of odd numbers: " + a4);
        System.out.println("Sum of all array elements: " + a5);
    }
}
