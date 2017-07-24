package lesson9_10;

public class Tulip extends Flower {
    Tulip(String name, int date) {
        super(name, date);
        count++;
    }

    @Override
    int price() {
        return 50;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
