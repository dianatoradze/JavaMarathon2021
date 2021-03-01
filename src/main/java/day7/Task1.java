package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("boing", 2010, 60000, 50000);
        Airplane a2 = new Airplane("ty-154", 1990, 40000, 50000);
        Airplane.compareAirplanes(a1,a2);
    }
}