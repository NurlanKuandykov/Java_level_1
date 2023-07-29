package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] x = new int[100];
        Random r = new Random();
        for (int i = 0; i<x.length; i++) x[i] = r.nextInt(10000);
        int max = 0, min = 10000, quant = 0, sum = 0;
        for (int element : x){
            if (element>max) max=element;
            if (element<min) min = element;
            if (element % 10 == 0) {
                ++quant;
                sum += element;
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.println("The largest element of the array: " + max);
        System.out.println("The smallest element of the array: " + min);
        System.out.println("Quantity of array elements ending in 0 " + quant);
        System.out.println("Sum of array elements ending in 0 - " + sum);
    }
}
