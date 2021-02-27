package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = 100;
        int min = 0;
        int max = 10000;
        int diff = max - min;
        int count = 0;
        int sum = 0;
        Random random = new Random();
        int[] numbers = new int[n];
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(diff) + min;
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
            if (i == 0) {
                minValue = numbers[0];
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
            if (numbers[i] % 10 == 0) {
                count++;
                for (int x : numbers) {
                    sum += x;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("наибольший элемент массива" + " " + maxValue);
        System.out.println("наименьший элемент массива" + " " + minValue);
        System.out.println("количество элементов массива, оканчивающихся на 0:" + " " + count);
        System.out.println("сумма элементов массива, оканчивающихся на 0:" + " " + sum);
    }
}
