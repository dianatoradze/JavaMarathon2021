package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; scanner.hasNextDouble(); i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            boolean error = false;
            if (b == 0) {
                error = true;
                break;
            } else {
                double result = a / b;
                System.out.println(result);
            }
        }
    }
}
