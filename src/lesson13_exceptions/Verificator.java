package lesson13_exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verificator {
    public static boolean verify(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if(login.length() > 20) {
            throw new WrongLoginException("Login length must be less than 20");
        }
        if(login.contains(" ")) {
            throw new WrongLoginException("Login cannot contain spaces");
        }

        if(password.length() > 20) {
            throw new WrongPasswordException("Password length must be less than 20");
        }

        boolean hasDigits = false;
        for(char c : password.toCharArray()) {
            if(c == ' ')  throw new WrongPasswordException("Password cannot contain spaces");
            if (48 <= c && c <= 57 ) {
                hasDigits = true;
            }
        }
        if(!hasDigits) throw new WrongPasswordException("Password must contain at least one digit");
        if(!password.equals(confirmPassword)) throw new WrongPasswordException("Password is not correct");
        return true;
    }
}
