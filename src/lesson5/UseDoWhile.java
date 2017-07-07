package lesson5;

public class UseDoWhile {
    public static void main(String[] args) {
        int number = 1;
        do {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
            number++;
        } while (number < 100);
    }
}
