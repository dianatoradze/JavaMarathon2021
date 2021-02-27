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
class Car {
    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
