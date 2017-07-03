package lesson4;

import java.util.Scanner;

public class CheckInt {
    public void check() {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Введите " + i + " целое число: ");
            if (sc.hasNextInt()) {
                temp = sc.nextInt();
                if (temp % 2 == 0) {
                    System.out.println("Введенное число чётное!!!");
                } else {
                    System.out.println("Введенное число  нечётное!!!");
                }
            } else {
                System.out.println("Введенное число не целое!!");
            }
            sc.nextLine();
        }
    }

    public static void main(String[] args) {
        CheckInt checkInt = new CheckInt();
        checkInt.check();
    }
}