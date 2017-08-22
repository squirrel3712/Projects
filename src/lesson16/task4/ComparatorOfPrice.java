package lesson16.task4;

import java.util.Comparator;

public class ComparatorOfPrice implements Comparator<Product> {
    @Override
    public int compare(Product first, Product second) {
        return first.getPrice() - second.getPrice();
    }
}
