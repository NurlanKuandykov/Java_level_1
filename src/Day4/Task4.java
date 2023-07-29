package Day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] x = new int[100];
        Random r = new Random();
        for (int i = 0; i<x.length; i++) x[i] = r.nextInt(10000);

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i<x.length-2; i++){
            int sum = 0;
            for (int j = i; j<i+3; j++) sum+=x[j];
            if (sum>maxSum) {
                maxSum=sum;
                maxSumIdx=i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIdx);
    }
}
