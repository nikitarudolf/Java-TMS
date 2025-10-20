package lesson7_oop;

public class Doctor extends Person {

    public void heal () {
        System.out.println("Врач полечил пациента");
    }
Doctor(String n, String s, int bY) {
        super(n, s, bY);
}

}
