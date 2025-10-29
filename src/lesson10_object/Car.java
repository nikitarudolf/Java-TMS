package lesson10_object;

public class Car implements Cloneable{
    String manufacturer;
    int yearOfProduction;

    Car(String m, int y) {
        this.manufacturer = m;
        this.yearOfProduction = y;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
