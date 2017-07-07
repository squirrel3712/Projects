package lesson5;

public class CheckNumber {
    public static void main(String[] args) {
        int number = 0;
        for (String str : args) {
            number = Integer.parseInt(str);
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
