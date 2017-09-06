package lesson18.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrongExceptionDemo {
    public static boolean checkInfo(String login, String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("^[a-z0-9_]{7,20}$");
        Matcher matcher1 = pattern.matcher(login);
        Matcher matcher2 = pattern.matcher(password);
        boolean state = true;
        try {
            if (!matcher1.matches()) {
                state = false;
                throw new WrongLoginException("Not correct login");
            }
            if (!matcher2.matches() || !password.equals(confirmPassword)) {
                state = false;
                throw new WrongPasswordException();
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        } finally {
            System.out.println("login = " + login);
            System.out.println("password = " + password);
            System.out.println("confirmPassword = " + confirmPassword);
        }
        return state;
    }

    public static void main(String[] args) {
        checkInfo("123_sq_uirrel371237", "12309876", "12309876");
    }
}
