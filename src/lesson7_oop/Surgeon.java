package lesson7_oop;

public class Surgeon extends Doctor {
    @Override
    public void heal () {
        super.heal();
        System.out.println("Хирург провел операцию");
    }

    Surgeon(String n, String s, int bY) {
        super(n, s, bY);
    }
}
