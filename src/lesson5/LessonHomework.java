package lesson5;


import java.util.Random;
import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {

//        twoDimArray();
//        chessPlate();
        snakeFill();
    }

    public static void twoDimArray() {
        int rows = 5, cols = 5;
        int number;
        int arrElemSumm = 0;
        Scanner in  = new Scanner(System.in);
        Random random = new Random();
        int[][] arr = new int[rows][cols];

        for (int i =0; i<rows; i++) {

            for (int j = 0; j<cols; j++){
                arr[i][j] = random.nextInt(100);
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Введите число для добавления: ");

        number = in.nextInt();

        System.out.println("Измененный массив: ");
        for (int i =0; i<rows; i++) {

            for (int j = 0; j<cols; j++){
                arrElemSumm += arr[i][j] += number;
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов: " + arrElemSumm);

    }

    //Создать программу для раскраски шахматной доски с помощью цикла. Создать
    //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    //B(Black) или W(White). При выводе результат работы программы должен быть
    //
    //следующим:
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W

    public static void chessPlate() {
        String[][] chessPlate = new String[8][8];
        String colorWhite = "W";
        String colorBlack = "B";


        for(int i = 0; i<8; i++) {
            System.out.println();

            for(int j = 0; j<8; j++) {

                if( (i+j) % 2 == 0 ) {
                    chessPlate[i][j] = colorWhite;
                }
                else {
                    chessPlate[i][j] = colorBlack;
                }
                System.out.print(chessPlate[i][j]);

            }
        }

    }

    //Задача *:
    //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
    //Формат входных данных:
    //Программа получает на вход два числа n и m.
    //Формат выходных данных:
    //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    //символа.

    public static void snakeFill() {
        int n,m;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число строк: ");
        n = in.nextInt();
        System.out.println("Введите число столбцов: ");
        m = in.nextInt();

        int[][] A = new int[n][m];
        int top = 0;
        int left;
        int element = 0;

        while (top < n) {
            left = 0;
            while(left < m) {
                A[top][left] = element++;
                left++;
            }
            top++;
            left = m-1;
            if(top != n) {
                while(left >= 0) {
                    A[top][left] = element++;
                    left--;
                }
            }
            top++;
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.println();
        }

    }
}
