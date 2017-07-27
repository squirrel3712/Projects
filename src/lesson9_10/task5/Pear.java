package lesson9_10.task5;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Pear extends Fruit {
    public Pear(int weight) {
        super(weight);
    }

    public int getPrice() {
        return 10;
    }

    public int costOfPear(Pear... pear) {
        int sum = 0;
        for (Pear p : pear) {
            sum += getPrice() * p.getWeight();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
