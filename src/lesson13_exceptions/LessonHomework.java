package lesson13_exceptions;

import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
    useTryCatch();
    }

    public static void useTryCatch() {
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a/b);
            int[] array = new int[]{1,2,3,4};
            for(int index = 0; index< 5; index++) {
                System.out.println(array[index]);
            }


        } catch(Throwable e)
        {
            System.out.println(e.getMessage());
        }
    }
}
