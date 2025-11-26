package lesson13_exceptions;

import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
        String confirmPassword = "teachme100skills";
        String inputPassword;
        String inputLogin;

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Input login: ");
            inputLogin = in.nextLine();
            System.out.println("Input password: ");
            inputPassword = in.nextLine();

            try {
                Verificator.verify(inputLogin,inputPassword,confirmPassword);
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        System.out.println("Correct!");


    }


}
