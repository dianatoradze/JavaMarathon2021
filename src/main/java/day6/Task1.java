package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Тайота");
        car1.setColor("черный");
        car1.setYear(2020);
        car1.info();
        car1.yearDifference(2012);

        Motorbike motorbike = new Motorbike("Тайота", "черный", 2020);
        motorbike.info();
        motorbike.yearDifference(2000);
    }
}
