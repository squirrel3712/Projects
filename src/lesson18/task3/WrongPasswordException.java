package lesson18.task3;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
