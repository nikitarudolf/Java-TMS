public class Main {


    static class Car {
        int color;
        double maxSpeed;
        int mileage;

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

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Second commit");
        int a = 5;
        int b = 10;
        System.out.println(a * b);

        for (int i = 0; i < a * b; i++) {
            System.out.println(i);
            System.out.println(a * i);
        }

        for (int i = 0; i < 5; i++) {
            // Changed ^ to * - ^ is bitwise XOR, not exponentiation
            System.out.println(a * i);
            System.out.println(a * b);
        }

        // Create Car instance
        Car bmw = new Car();
        bmw.color = 12245;
        bmw.maxSpeed = 243;
        bmw.mileage = 76543;

        // Call the getter methods (with parentheses)
        System.out.println(bmw.getColor());
        System.out.println(bmw.getMaxSpeed());
        System.out.println(bmw.getMileage());
    }
}