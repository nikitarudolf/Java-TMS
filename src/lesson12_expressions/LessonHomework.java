package lesson12_expressions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonHomework {

    public static void main(String[] args) {
        getAbbreveation();
    }

    public static void getAbbreveation() {
        Scanner in = new Scanner(System.in);
        String input;

        System.out.println("Введите строку");

        input = in.nextLine();

        Pattern abbreviation = Pattern.compile("\\b[A-Z]{2,5}\\b");
        Matcher m = abbreviation.matcher(input);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
