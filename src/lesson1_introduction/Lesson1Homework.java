package lesson1_introduction;

public class Lesson1Homework {
    public static void main(String[] args) {

        System.out.println(calculateFormula());
        System.out.println(sumTwoDigits());
        System.out.println(sumThreeDigits());
        System.out.println(roundNumber());
        System.out.println(getDivisionRemainder());
        swapNumbers();
    }

    public static double calculateFormula() {
        double a, b, c;
        b = 5;
        c = 22.1;
        a=4*(b+c-1)/2;
        return a;
    }

    public static int sumTwoDigits() {
        int n = 26;
        return n / 10 + n % 10;
    }

    public static int sumThreeDigits() {
        int n = 126;
        return n / 100 + n % 100 / 10 + n % 100 % 10;
    }

    public static int roundNumber() {
       double n = 22.521;
       return (int)(n+0.5);
    }

    public static String getDivisionRemainder() {
        int q, w;
        q = 21;
        w = 8;
        return (q + " / " + w + " = " + q / w + " и " + q % w + " в остатке");
    }

    public static void swapNumbers() {
        int a = 5;
        int b = 8;
        a *= b; // 40
        b = a/b;
        a /= b;
        System.out.println(a);
        System.out.println(b);
    }

}
