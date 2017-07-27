package lesson9_10.task5;

public class Apricot extends Fruit {
    public Apricot(int weight) {
       super(weight);
    }

    public int getPrice() {
        return 20;
    }

    public int costOfApricot(Apricot... apricots) {
        int sum = 0;
        for (Apricot a : apricots) {
            sum += getPrice() * a.getWeight();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
