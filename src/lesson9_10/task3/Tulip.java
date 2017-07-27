package lesson9_10.task3;

public class Tulip extends Flower {
    public  int countOfFlowers;
    public Tulip(String name, int date) {
        super(name, date);
        countOfFlowers++;
    }

    @Override
    public int price() {
        return 50;
    }

    public int costBouquetOfTulip(){
        return price() * countOfFlowers;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
