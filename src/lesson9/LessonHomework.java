package lesson9;

public class LessonHomework {
    public static void main(String[] args) {
        Triangle t = new Triangle(3,4,5);
        t.calculateArea();
        t.calculatePerimeter();

        Rectangle r = new Rectangle(123.1, 54.3);
        r.calculateArea();
        r.calculatePerimeter();

        Circle c = new Circle(8);
        c.calculateArea();
        c.calculatePerimeter();

        System.out.println("-".repeat(50));
        Figure[] figures = new Figure[]{new Triangle(6, 8, 10),c.clone(),new Rectangle(7,8),c.clone().clone(),new Triangle(3, 4, 5)};
        for(Figure figure : figures) {
            figure.calculateArea();
            figure.calculatePerimeter();
        }
    }
}
