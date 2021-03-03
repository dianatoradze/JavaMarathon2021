package day9.Task2;

public class Rectangle extends Figure{
    private double width;
    private double heigth;
    public Rectangle(double width, double heigth,String color) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return width*heigth;
    }

    @Override
    public double perimeter() {
        return 2*(width+heigth);
    }
}
