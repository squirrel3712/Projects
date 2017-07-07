package lesson5;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean state;
        do {
            System.out.println("Введите число: ");
            state = false;
            if (sc.hasNextInt()) {
                number = sc.nextInt();
            } else {
                state = true;
            }
            sc.nextLine();
        } while (state);
        if (number >= 0 && number < 10) {
            System.out.println("Чило положительное и меньше 10 ");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
