package lesson5;

public class Days {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number == 1) {
            System.out.println("Понедельник");
        } else if (number == 2) {
            System.out.println("Вториник");
        } else if (number == 3) {
            System.out.println("Среда");
        } else if (number == 4) {
            System.out.println("Четверг");
        } else if (number == 5) {
            System.out.println("Пятница");
        } else if (number == 6 || number == 7) {
            System.out.println("Выходной");
        }
    }
}
