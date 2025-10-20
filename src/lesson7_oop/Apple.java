package lesson7_oop;

public class Apple {
    private String color = "Green";

    public Apple() {

    }

    public Apple(Apple appleToChange, String newColor) {
        appleToChange.color = newColor;
    }

    public String getColor() {
        return color;
    }
}
