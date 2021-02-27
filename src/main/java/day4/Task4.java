package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int n = 100;
        Random random = new Random();
        int index = 0;
        random.nextInt(10000);
        int[] numbers = new int[n];
        int maxValue = 0;
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(10000);
        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            for (int j = 1; j < i + 3; j++) {
                sum += j;
            }
            if (sum > maxValue) {
                maxValue = sum;
                index = i;
            }
        }
        System.out.println("sum   = " + maxValue);
        System.out.println("index = " + index);
        System.out.println(Arrays.toString(numbers));
    }
}

