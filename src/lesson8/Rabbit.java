package lesson8;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Пи-пи-пи");
    }
    @Override
    public void eat(String food) {
        if(food == "Grass") {
            System.out.println("Кролик любит есть траву");
            return;
        }
        System.out.println("Кролик не хочет есть "+food);
    }
}
