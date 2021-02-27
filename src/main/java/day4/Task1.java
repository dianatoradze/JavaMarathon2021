package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = 0;
        int max = 10;
        int diff = max - min;
        int count = 0;
        int count1 = 0;
        int countEven = 0;
        Random random = new Random();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(diff) + min;
            if (numbers[i] > 8) {
                count++;
            }
            if (numbers[i] == 1) {
                count1++;
            }
            if (numbers[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива:" + " " + numbers.length);
        System.out.println("Количество чисел больше 8:" + " " + count);
        System.out.println("Количество чисел равных 1:" + " " + count1);
        System.out.println("Количество четных чисел:" + " " + countEven);
    }
}
