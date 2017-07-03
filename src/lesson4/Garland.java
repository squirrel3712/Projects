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
        int garland = 20;
        Garland gar = new Garland();
        gar.printState(garland);
        gar.turnONFirstPos(garland);
        System.out.println("Мигание...");
        gar.blinkGarland(garland, 3);
        System.out.println("Режим бегущей строки:");
        gar.shiftString(garland);

    }
}
