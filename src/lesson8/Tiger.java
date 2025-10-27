package lesson8;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Рррр-ррр");
    }
    @Override
    public void eat(String food) {
        if(food == "Sheep") {
            System.out.println("Тигр любит есть овец");
            return;
        }
        System.out.println("Тигр не хочет есть "+food);
    }
}
