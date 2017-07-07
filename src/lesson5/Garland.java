package lesson4;

public class Garland {
    public void blinkGarland(int garland, int count) {
        for (int i = 0; i < count; i++) {
            garland = ~garland;
            printState(garland);
        }
    }

    public void printState(int garland) {
        System.out.println("Состояние гирлянды " + Integer.toBinaryString(garland));
    }

    public void turnONFirstPos(int garland) {
        int res = garland & 1;
        String str = Integer.toBinaryString(res);
        if (str.substring(str.length() - 1).equals("0"))
            System.out.println("Лампочка на первой позиции выключена!");
        else
            System.out.println("Лампочка на первой позиции включена!");

    }

    public void shiftString(int garland) {
        for (int i = 0; i < 5; i++) {
            garland <<= i;
            System.out.print(Integer.toBinaryString(garland) + " ");
        }
    }

    public static void main(String[] args) {
        int garland = 20, number = 0;
        Garland gar = new Garland();
        IntSum value = new IntSum();
        number = value.checkNumber("Введите число от 1 до 4", "Ошибка ввода!!!");
        switch (number) {
            case 1:
                gar.printState(garland);
                break;
            case 2:
                gar.turnONFirstPos(garland);
                break;
            case 3:
                System.out.println("Мигание...");
                gar.blinkGarland(garland, 3);
                break;
            case 4:
                System.out.println("Режим бегущей строки:");
                gar.shiftString(garland);
                break;
            default:
                System.out.println("Нет подходящего case.");
        }
    }
}
