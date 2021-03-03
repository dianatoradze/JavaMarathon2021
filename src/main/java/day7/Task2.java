package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 90;
        int b = 100;
        int numbers = a + random.nextInt(b - a + 1);
        Player player1 = new Player(numbers);
        Player player2 = new Player(numbers);
        Player player3 = new Player(0);

        Player.info();
        Player.run();
        Player.run();
        Player.run();
        System.out.println("Количество игроков на поле " + Player.getCountPlayers());
        Player player4 = new Player(numbers);
        Player player5 = new Player(numbers);
        Player player6 = new Player(numbers);
        Player player7 = new Player(numbers);
        Player.getCountPlayers();
        Player.info();
    }
}
