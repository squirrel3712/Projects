package lesson5;

import java.util.Random;

public class Factorial {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        double fact = 1;
        if (number < 0) {
            System.out.println("Отрицательный факториал");
        } else if (number == 0 || number == 1) {
            fact = 1;
        } else {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("Факториал " + number + " = " + fact);
        }
    }
}
