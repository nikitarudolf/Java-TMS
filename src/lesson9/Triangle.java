package lesson9;

public class Triangle extends Figure {
    private double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void calculateArea() {
        double p = (a + b + c) / 2;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(a+b+c);
    }
}
