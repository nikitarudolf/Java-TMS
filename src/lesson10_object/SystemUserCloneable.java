package lesson10_object;

import java.util.Objects;

public class SystemUserCloneable implements Cloneable {
    private int id;
    private String name;
    private boolean isAdmin;
    private Car car;

    SystemUserCloneable(int i, String n, boolean isAdmin, Car c) {
        this.id = i;
        this.name = n;
        this.isAdmin = isAdmin;
        this.car = c;
    }

    public SystemUserCloneable() {
        this.isAdmin = false;
        this.name = "name";
        this.id = -1;
        this.car = new Car("", -1);
    }

    @Override // Глубокое
    public SystemUserCloneable clone() throws CloneNotSupportedException {
        SystemUserCloneable newUser = (SystemUserCloneable)super.clone();
        newUser.car = this.car.clone();
        return newUser;
    }

    public SystemUserCloneable cloneShallow() throws CloneNotSupportedException {
        return (SystemUserCloneable) super.clone();
    }

    @Override
    public String toString() {
        return "SystemUserCloneable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAdmin=" + isAdmin +
                ", car=" + car.toString() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public void header() {
        System.out.printf("%-15s %-10s %-8s %-12s%n", "name", "id", "isAdmin", "car");
    }
    public void output() {
        System.out.printf("%-15s %-10d %-8s %-12s%n", name, id, isAdmin, this.car.getManufacturer());
    }
}
