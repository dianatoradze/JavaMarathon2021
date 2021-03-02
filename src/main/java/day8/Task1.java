package day8;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int a = 0;
        int b = 20000;

        String strings = "";
        long start1 = System.currentTimeMillis();
        for (int i = a; i <= b; i++) {
            strings += i + " ";
        }
        long finish1 = System.currentTimeMillis();
        long time1 = finish1 - start1;
        System.out.print(strings);
        System.out.println();
        System.out.println("Способ 1 - " + time1);
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = a; i <= b; i++) {
            sb.append(i + " ");
        }
        System.out.print(sb.toString());
        long finish2 = System.currentTimeMillis();
        long time2 = finish2 - start2;
        System.out.println();
        System.out.println("Способ 2 - " + time2);
    }
}
