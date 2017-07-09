package lesson6;

import java.util.Scanner;

public class Garland {
    public void blinkGarland(int[] garland, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < garland.length; j++) {
                if (garland[j] == 0) {
                    garland[j] = 1;
                } else {
                    garland[j] = 0;
                }
            }
            printState(garland);
            System.out.println();
        }
    }

    public void printState(int[] garland) {
        for (int i = 0; i < garland.length; i++) {
            System.out.print(garland[i] + " ");
        }
    }

    public void turnONFirstPos(int[] garland) {
        if (garland[garland.length - 1] == 0) {
            System.out.println("Лампочка выключена!");
        } else {
            System.out.println("Лампочка включена");
        }
    }

    public void shiftString(int[] garland) {
        for (int i = 0; i < garland.length; i++) {
            garland[i] <<= 1;
            System.out.print(Integer.toBinaryString(garland[i]) + " ");
        }
    }

    public int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[32];
        int number;
        Garland gar = new Garland();
        array = gar.fillArray(array);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4");
        number = sc.nextInt();
        switch (number) {
            case 1:
                gar.printState(array);
                break;
            case 2:
                gar.turnONFirstPos(array);
                break;
            case 3:
                System.out.println("Мигание...");
                gar.blinkGarland(array, 3);
                break;
            case 4:
                System.out.println("Режим бегущей строки:");
                gar.shiftString(array);
                break;
            default:
                System.out.println("Нет подходящего case.");
        }
    }
}
