package lesson9;

import java.beans.ConstructorProperties;

public class Rectangle extends Figure {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void calculateArea() {
        System.out.println(a*b);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*(a+b));
    }
}
