package day9.Task2;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c,String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter()*((perimeter()-a)*(perimeter()-b)*(perimeter()-c)));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
