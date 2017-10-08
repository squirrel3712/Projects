package com.company;

import java.util.Scanner;

public class Input {
    public static int entranceNumber() {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        if (sc.hasNextInt()) {
            temp = sc.nextInt();
        } else {
            System.out.println("Incorrect entrance ");
            System.out.println("Try again");
            sc.nextLine();
        }
        return temp;
    }
}
