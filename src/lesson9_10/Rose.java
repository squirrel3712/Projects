package lesson9_10;

public class Rose extends Flower {
    Rose(String name, int date) {
        super(name, date);
        count++;
    }

    @Override
    int price() {
        return 100;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
