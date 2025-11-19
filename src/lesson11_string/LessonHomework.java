package lesson11_string;

import java.util.Arrays;
import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {

    stringTask();
    }

    public static void stringTask() {
        String s1, s2, s3, shortest, longest;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        s1 = in.nextLine();
        System.out.println("Введите строку 2: ");
        s2 = in.nextLine();
        System.out.println("Введите строку 3: ");
        s3 = in.nextLine();

        System.out.println("Введенные строки: \n"+s1+"\n"+s2+"\n"+s3);

        shortest = (s1.length() <= s2.length() && s1.length() <= s3.length()) ? s1 :
                (s2.length() <= s1.length() && s2.length() <= s3.length()) ? s2 : s3;
        longest = (s1.length() >= s2.length()) ? (s1.length() >= s3.length()) ? s1 : s3
                : (s2.length() >= s3.length()) ? s2 : s3;

        System.out.println("Самая короткая строка: " + shortest + " длина: "+ shortest.length());
        System.out.println("Самая длинная строка: " + longest + " длина: "+ longest.length());

        System.out.println("---".repeat(50)+"\n");
        String[] strings = {s1, s2, s3};

        for(int i =0; i< strings.length-1; i++) {
            if (strings[i].length() > strings[i+1].length()) {
                String temp;
                temp = strings[i];
                strings[i] = strings[i+1];
                strings[i+1] = temp;
            }
        }

        for( String s : strings) {
            System.out.println(s);
        }

        System.out.println("---".repeat(50)+"\n");

        double averageLength = (double) (s1.length() + s2.length() + s3.length()) /3;
        System.out.println("Средняя длина строки: " + averageLength);
        System.out.println("Строки с длиной меньше средней: ");
        for( String s : strings) {
            if(s.length() < averageLength) {
                System.out.println("Строка: " + s);
                System.out.println("Длина: " + s.length());
            }
        }

        System.out.println("---".repeat(50)+"\n");

        for( String s : strings) {
            s.toLowerCase();
            char[] temp = s.toCharArray();
            int index;
            boolean exitFlag = false;

            for(int i = 0; i < temp.length; i++) {
                for(int j = 0; j < temp.length; j++) {
                    if (i == j) continue;
                    if (temp[i] == temp[j]) {
                        exitFlag = true;
                        break;
                    }
                }
            }
            if(!exitFlag) System.out.println("Строка "+ s + " состоит только из различных символов");
        }

        System.out.println("---".repeat(50)+"\n");

        System.out.println("Введите новую строку");
        String ssttrriinngg = in.nextLine();




        char[] temp = ssttrriinngg.toCharArray();

        char[] newStr = new char[ssttrriinngg.length()*2];

        for(int i = 0; i<temp.length; i++) {
            newStr[i+i] = temp[i];
            newStr[i+i+1] = temp[i];
        }

        String doubledStr = String.valueOf(newStr);
        System.out.println("Удвоенная строка: "+doubledStr);

    }
}
