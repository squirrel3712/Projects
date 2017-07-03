package lesson4;

import java.util.Scanner;

public class IntSum {
    public int checkNumber(String question, String ifWrong) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println(question);
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            System.out.println(ifWrong);
        }
        return number;
    }

    public void sum() {
        int first = 0, second = 0, sum = 0;
        first = checkNumber("Введите первое число: ", "Введенное число не целое!!!");
        second = checkNumber("Введите второе число: ", "Введенное число не целое!!!");
        sum = first + second;
        System.out.println("Сумма чисел = " + sum);
    }

    public static void main(String[] args) {
        IntSum intSum = new IntSum();
        intSum.sum();
    }
}
