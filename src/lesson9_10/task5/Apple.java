package lesson9_10.task5;

public class Apple extends Fruit {
    public Apple(int weight) {
        super(weight);
    }

    public int getPrice() {
        return 15;
    }

    public int costOfApple(Apple... apples) {
        int sum = 0;
        for (Apple a : apples) {
            sum += getPrice() * a.getWeight();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
