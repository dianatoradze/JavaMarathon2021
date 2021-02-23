package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner stage = new Scanner(System.in);
        //System.out.println("Введите количество этажей в здании");
        int x = stage.nextInt();

        if (x >= 1 && x <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (x >= 5 && x <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (x >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (x <= 0) {
            System.out.println("Ошибка ввода");
        }
    }
}


