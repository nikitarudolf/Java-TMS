package lesson9;

public class Circle extends Figure implements Cloneable {
    double radius;

    Circle(double r) {
        this.radius = r;
    }
    @Override
    public void calculatePerimeter() {
        System.out.println(6.28*radius);
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14*radius*radius);
    }

    @Override
    public Circle clone() {
        Circle clone = new Circle(this.radius*2);
        return clone;
    }
}
