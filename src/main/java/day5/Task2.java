package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Нэксия", "красный", 2010);

        System.out.println("Модель машины - " + motorbike.getModel());
        System.out.println("Год выпуска - " + motorbike.getYear());
        System.out.println("Цвет машины - " + motorbike.getColor());
    }
}

