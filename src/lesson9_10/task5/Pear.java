package lesson9_10.task5;


public class Pear extends Fruit {
    public static final int PRICE_PER_KG = 15;

    public Pear(int weight) {
        super(weight);
    }

    public int getPrice() {
        return PRICE_PER_KG * getWeight();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
