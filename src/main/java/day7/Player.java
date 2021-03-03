package day7;

public class Player {

    private static int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers += 1;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void run() {

        if (stamina != 0) {
            System.out.println("На поле вышел игрок с выносливостью " + Player.stamina);
            stamina--;
        }
        if (stamina == 0) {
            countPlayers--;
        }
        return;
    }

    public static void info() {

        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть" + " " + (6 - countPlayers) + " " + "свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}



