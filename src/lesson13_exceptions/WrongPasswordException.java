package lesson13_exceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        System.out.println("Wrong Password");
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
