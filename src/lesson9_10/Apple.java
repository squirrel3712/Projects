package lesson9_10;

public class Apple extends Fruit {
    public static int count;

    public Apple() {
        count++;
    }

    public int getPrice() {
        return 15;
    }

    public int sumOfApple() {
        return count * getPrice();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
