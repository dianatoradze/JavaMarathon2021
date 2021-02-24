package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            boolean error = false;
            if (b == 0) {
                error = true;
                System.out.println("Деление на 0");
            } else {
                double result = a / b;
                System.out.println(result);
            }
        }
    }
}
