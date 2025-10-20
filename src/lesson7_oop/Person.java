package lesson7_oop;

public class Person {
    private String name;
    private  String surname;
    private int birthYear;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(String n, String s, int bY) {
        this.name = n;
        this.surname = s;
        this.birthYear = bY;
    }

    public Person() {

    }

}
