package lesson9_10.task5;

public class Apple extends Fruit {
    public static final int PRICE_PER_KG = 10;

    public Apple(int weight) {
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
