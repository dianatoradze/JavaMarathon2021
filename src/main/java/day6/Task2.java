package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("boing", 2010, 20000, 50000);
        airplane.setYear(2000);
        airplane.setLength(40000);

        airplane.fillUp(100);
        airplane.fillUp(3000);
        airplane.info();
    }
}
