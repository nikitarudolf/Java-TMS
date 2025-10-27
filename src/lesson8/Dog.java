package lesson8;

public class Dog extends Animal {
     Dog()  {

    }
    @Override
    public void voice() {
        System.out.println("Гав-гав");
    }
    @Override
    public void eat(String food) {
        if(food == "Meat") {
            System.out.println("Собака любит мясо");
            return;
        }
        System.out.println("Собака не хочет есть "+food);
    }
}
