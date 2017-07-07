package lesson5;

public class UseSwitch {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        switch (number) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вториник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
        }
    }
}
