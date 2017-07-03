package lesson4;

import java.util.Scanner;

public class AbsoluteValue {
    public void minValue() {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, c = 0, min;
        boolean bool = false;
        do {
            bool = false;
            System.out.println("Enter the first number: ");
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
                System.out.println("Enter the second number: ");
                if (sc.hasNextDouble()) {
                    b = sc.nextDouble();
                    System.out.println("Enter the third number: ");
                    if (sc.hasNextDouble()) {
                        c = sc.nextDouble();
                    } else {
                        System.out.println("Not appropriate number");
                        bool = true;
                        sc.nextLine();
                    }
                } else {
                    System.out.println("Not appropriate number");
                    bool = true;
                    sc.nextLine();
                }
            } else {
                System.out.println("Not appropriate number");
                bool = true;
            }
            sc.nextLine();
        } while (bool);
        a = (a < 0) ? -a : a;
        b = b < 0 ? -b : b;
        c = c < 0 ? -c : c;
        min = a;
        min = (min < b) ? min : b;
        min = (min < c) ? min : c;
        System.out.print("Minimum = " + min);
    }

    public static void main(String[] args) {
        AbsoluteValue value = new AbsoluteValue();
        value.minValue();
    }
}
