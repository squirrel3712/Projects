package lesson5;

public class PrintChar {
    public static void main(String[] args) {
        char ch = 'h';
        for (int i = 0; i < 55; i++) {
            System.out.print(ch++ + " ");
        }
    }
}
