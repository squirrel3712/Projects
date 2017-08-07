package lesson14;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a1, V a2) {
        return a1.doubleValue() + a2.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a1, V a2) {
        return a1.doubleValue() * a2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a1, V a2) {
        if (a2.doubleValue() != 0) {
            return a1.doubleValue() / a2.doubleValue();
        }
        return -1;
    }

    public static <T extends Number, V extends Number> double subtraction(T a1, V a2) {
        return a1.doubleValue() - a2.doubleValue();
    }

    public static void main(String[] args) {
        Integer i = 12;
        Double d = 9.0;
        System.out.println("Sum : " + sum(i, d));
        System.out.println("Multiply : " + multiply(i, d));
        System.out.println("Divide : " + divide(i, d));
        System.out.println("Subtraction : " + subtraction(i, d));
    }
}
