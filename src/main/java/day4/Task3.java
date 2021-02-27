package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int min = 0;
        int max = 50;
        int diff = max - min;
        int index = 0;
        Random random = new Random();
        int[][] numbers = new int[m][n];
        int maxValue = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                numbers[i][j] = random.nextInt(diff) + min;
                sum += numbers[i][j];
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
            if (sum > maxValue) {
                maxValue = sum;
                index = i;
            }
        }
        System.out.println("Максимальная сумма элементов строки" + " " + maxValue);
        System.out.println("Строки с макс суммой:" + " " + index);
    }
}
