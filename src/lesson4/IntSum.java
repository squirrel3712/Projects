package lesson4;

import java.util.Scanner;

public class IntSum {
    public void sum() {
        Scanner sc = new Scanner(System.in);
        int first = 0, second = 0, sum = 0;
        System.out.println("Введите первое число: ");
        if (sc.hasNextInt()) {
            first = sc.nextInt();
        } else {
            System.out.println("Введенное число не целое!!!");
        }
        sc.nextLine();
        System.out.println("Введите второе число: ");
        if (sc.hasNextInt()) {
            second = sc.nextInt();
        } else {
            System.out.println("Введенное число не целое!!!");
        }
        sum = first + second;
        System.out.println("Сумма чисел = " + sum);
    }

    public static void main(String[] args) {
        IntSum intSum = new IntSum();
        intSum.sum();
    }
}
