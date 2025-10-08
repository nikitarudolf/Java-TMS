package lesson4_array;

import java.util.Random;
import java.util.Scanner;

public class LessonHomework {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        double[] arr = new double[in.nextInt()];

        fillArray(arr);
        printArr(arr);                // 1
        findMinMaxElement(arr);       // 2
        findMinMaxIndex(arr);         // 3
        findZero(arr);                // 4
        swapElements(arr);            // 5
        isIncreasingSequence(arr);    // 6
        incrementArray();             // *
    }

    public static void fillArray(double[] array) {
        Scanner in = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("Выберите способ заполнения массива\n1) Рандом\n2) Вручную");
        switch (in.nextInt()) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    array[i] = randomNumber.nextDouble(0,100);
                }
                break;

            case 2:
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Введите элемент " + (i+1));
                    array[i] = in.nextDouble();
                }
                break;
            default:
                break;
        }
    }


    public static void printArr(double[] array) {
        System.out.println("Вывод массива в прямом порядке:");
        for(int i = 0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Вывод массива в обратном порядке:");
        for(int i = array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void findMinMaxElement(double[] array) {
        double min = array[0], max = array[0];

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            else if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);

    }

    public static void findMinMaxIndex(double[] array) {
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Индекс минимального элемента: " + minIndex + "\nИндекс максимального элемента: " + maxIndex);

    }
    public static void findZero(double[] array) {
        int zeroCounter = 0;

        for (double number : array) {
            if (number == 0) {
                zeroCounter++;
            }
        }

        System.out.println(zeroCounter == 0 ? "Нулевых элементов не найдено" : "Количество нулевых элементов:" + zeroCounter);

    }

    public static void swapElements(double[] array) {
        double temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }

    public static void isIncreasingSequence(double[] array) {
        int index = 0;

        for (double number : array) {
            if (number < array[index]) {
                index = 1;
                break;
            }
        }
        if (index == 1) {
            System.out.println("Массив не является возрастающей последовательностью");
            return;
        }
        System.out.println("Массив является возрастающей последовательностью");
    }

    public static void incrementArray() {
        int[] numbers = {9,9,9,9};
        boolean isLastNum = true;
        int a = 0;

        for(int i =0; i< numbers.length; i++ ) {
            a+=numbers[i]*(Math.pow(10,numbers.length-i-1));
        }

        a++;

        System.out.println(a);

        for(int number : numbers) {
            if(number != 9) {
               isLastNum = false;
               break;
            }
        }

        if(isLastNum) {
            int[] newNumbers = new int[numbers.length+1];
            for(int i = newNumbers.length - 1; i >= 0; i--) {
                newNumbers[i] = a % 10;
                a /= 10;
            }
            for(int num : newNumbers) {
                System.out.println(num);
            }
            return;
        }
        for(int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = a % 10;
            a /= 10;
        }
        for(int num : numbers) {
            System.out.println(num);
        }
    }

}


