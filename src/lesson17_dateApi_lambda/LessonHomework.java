package lesson17_dateApi_lambda;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LessonHomework {
    public static void main(String[] args) {
    calculateJubilee();
    outputPoisitiveNubmers();
    convertToDollarsViaFunction();
    convertToDollarsViaConsumer();
    convertToDollarsViaSupplier();

    }
    public static void calculateJubilee() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату своего рождения (в формате yyyy-mm-dd) ");
        LocalDate birthDate = LocalDate.parse(in.nextLine());
        System.out.println("Дата когда вам исполнится 100 лет: "+birthDate.plusYears(100));
    }

    public static void outputPoisitiveNubmers() {
        int [] numbers = new int[]{1,2,-1,3,-2,-4,-5,-1,9};

        Predicate<Integer> isPositive = x -> x > 0;

        for(int number : numbers) {
            if(isPositive.test(number)) System.out.println(number);
        }
    }

    public static void convertToDollarsViaFunction() {
        Function<String, String> convert = sum ->
                Double.parseDouble(sum.split(" ")[0]) / 3 +" USD";
        System.out.println("500 BYN = " + convert.apply("500 BYN"));
        System.out.println("600 BYN = " + convert.apply("600 BYN"));
        System.out.println("200 BYN = " + convert.apply("200 BYN"));

        System.out.println("Введите сумму для конвертации: ");
        System.out.println(" = " + convert.apply(new Scanner(System.in).nextLine()));
    }
    public static void convertToDollarsViaConsumer() {
        Consumer<String> convert = sum ->
                System.out.println(sum + " = " + Double.parseDouble(sum.split(" ")[0]) / 3 +" USD");

        System.out.println("Введите сумму для конвертации: ");
        convert.accept(new Scanner(System.in).nextLine());
    }

    public static void convertToDollarsViaSupplier() {
        Supplier<String> convert = () -> {
            System.out.println("Введите сумму для конвертации: ");
            String sum = new Scanner(System.in).nextLine();
            return sum + " = " + Double.parseDouble(sum.split(" ")[0]) / 3 +" USD";
        };
        System.out.println(convert.get());
    }
}
