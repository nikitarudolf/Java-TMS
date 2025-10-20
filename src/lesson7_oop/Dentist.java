package lesson7_oop;

public class Dentist extends Doctor {
    @Override
    public void heal() {
        super.heal();
        System.out.println("Дантист удалил зуб");
    }
    Dentist(String n, String s, int bY) {
        super(n, s, bY);
    }
}
