package lesson9_10;

public class Apricot extends Fruit {
    public static int count;

    public Apricot() {
        count++;
    }

    public int getPrice() {
        return 20;
    }

    public int sumOfApricot() {
        return count * getPrice();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
