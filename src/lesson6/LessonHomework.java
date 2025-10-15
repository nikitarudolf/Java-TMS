package lesson6;

import java.util.Arrays;

public class LessonHomework {

    public static void main(String[] args) {
        //
//        Задача 1:
//        Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//        метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//        который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//        выводит текущую информацию о карточке. Напишите программу, которая создает три
//        объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//                Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//        третьей. Выведите на экран текущее состояние всех трех карточек

        CreditCard visa = new CreditCard(0115102025, 500);
        CreditCard mastercard = new CreditCard(0215102025, 1500);
        CreditCard unionpay = new CreditCard(0315102025, 2500);

        visa.outputInfo();
        mastercard.outputInfo();
        unionpay.outputInfo();

        visa.addCredits(100);
        mastercard.addCredits(200);
        unionpay.withdrawCredits(1000);

        visa.outputInfo();
        mastercard.outputInfo();
        unionpay.outputInfo();
    }
}
