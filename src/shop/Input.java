package shop;

import java.util.Scanner;

public class Input {
    public static int entranceNumber() {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        do {
            try {
                temp = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Incorrect entrance " + e.getClass());
                System.out.println("Try again");
                sc.nextLine();
            }
        } while (true);
        return temp;
    }
}
