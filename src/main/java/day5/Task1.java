package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Тайота");
        car1.setYear(2004);
        car1.setColor("черный");
        System.out.println("Модель машины - " + car1.getModel());
        System.out.println("Год выпуска - " + car1.getYear());
        System.out.println("Цвет машины - " + car1.getColor());
    }
}
