package Day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] x = new int[12][8];
        Random r = new Random();
        for (int i = 0; i<x.length; i++){
            for (int j = 0; j<x[i].length; j++){
                x[i][j] = r.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i<x[i].length; i++){
            int sum = 0;
            for (int j = 0; j<x[i].length; j++) {
                sum = sum + x[i][j];
            }
            if (sum>=maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSumIdx);
    }
}
