package lesson13_exceptions;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException() {
        System.out.println("Wrong Login");
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
