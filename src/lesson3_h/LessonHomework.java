package lesson3_h;

import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
        isEvenNumber();  // 1
        analyzeTemp();   // 2
        calcSquares();   // 3
        printSequence(); // 4
        summNumbers();   // *
    }

    public static void isEvenNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        System.out.println("Ваше число " + number + (number % 2 == 0 ? " четное" : "нечетное") );
//      System.out.println("Ваше число " + (in.nextInt() % 2 == 0 ? " четное" : "нечетное") );

    }

    public static void analyzeTemp() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру");
        int t = in.nextInt();
        if(t > -5) {
            System.out.println("Warm");
        } else if (t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    public static void calcSquares() {
        for(int i = 10; i <= 20; i++) {
            System.out.println(i*i);
        }
    }

    public static void printSequence() {
        int number = 7;
        int i = 1;
        while(i<=14) {
            System.out.println(number * i++);
        }
    }

    public static void summNumbers() {
        int number;
        int summ = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите целое положительное число");
            if(in.hasNextInt()) {
                number = in.nextInt();
                if (number > 0) {
                    break;
                }
            }
            in.nextLine();
            System.out.println("Неверный ввод.");
        }

        for (int i = number; i!=0; i--) {
            summ += i;
        }
        System.out.println(summ);

    }
}
