
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello world!");
        System.out.println("Second commit");
        int a = 5;
        int b = 10;
        System.out.println(a*b);

        for (int i =0; i<a*b; i++) {
            System.out.println(i);
            System.out.println(a*i);
        }

        for (int i =0; i<5; i++) {
            System.out.println(a^i);
            System.out.println(a*b);
        }

        class Car {
            int color;
            double maxSpeed;
            int mileage;

            public int getColor;
            public double getMaxSpeed;
            public int getMileage;

            public int getColor() {
                return color;
            }

            public double getMaxSpeed() {
                return maxSpeed;
            }

            public int getMileage() {
                return mileage;
            }
        }

        Car bmw = new Car();
        bmw.color = 12245;
        bmw.maxSpeed = 243;
        bmw.mileage = 76543;


    }
}
