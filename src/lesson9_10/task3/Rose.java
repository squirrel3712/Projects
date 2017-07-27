package lesson9_10.task3;

public class Rose extends Flower {
    public  int countOfFlowers;

    public Rose(String name, int date) {
        super(name, date);
        countOfFlowers++;
    }

    @Override
    public int price() {
        return 100;
    }

    public int costBouquetOfRose() {
        return price() * countOfFlowers;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
