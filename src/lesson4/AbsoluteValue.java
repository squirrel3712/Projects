package lesson4;

import java.util.Scanner;

public class AbsoluteValue {
    public double checkNumber(String question, String ifWrong) {
        Scanner sc = new Scanner(System.in);
        boolean bool = false;
        double number = 0;
        do {
            bool = false;
            System.out.println(question);
            if (sc.hasNextDouble()) {
                number = sc.nextDouble();
            } else {
                System.out.println(ifWrong);
                bool = true;
            }
            sc.nextLine();
        } while (bool);
        return number;
    }

    public void minValue() {
        double a = 0, b = 0, c = 0, min;
        a = checkNumber("Enter the first number: ", "Not appropriate number");
        b = checkNumber("Enter the second number: ", "Not appropriate number");
        c = checkNumber("Enter the third number: ", "Not appropriate number");
        a = (a < 0) ? -a : a;
        b = (b < 0) ? -b : b;
        c = (c < 0) ? -c : c;
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
