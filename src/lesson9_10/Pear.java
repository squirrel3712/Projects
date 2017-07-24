package lesson9_10;

public class Pear extends Fruit {
    public static int count;

    public Pear() {
        count++;
    }

    public int getPrice() {
        return 10;
    }

    public int sumOfPear() {
        return count * getPrice();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
