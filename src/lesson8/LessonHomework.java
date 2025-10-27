package lesson8;

public class LessonHomework {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        dog.voice();
        dog.eat("Meat");
        dog.eat("Milk");

        tiger.voice();
        tiger.eat("Sheep");
        tiger.eat("Apple");

        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Meat");
    }
}
