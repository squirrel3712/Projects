package lesson16.task4;

import java.util.Comparator;

public class ComporatorOfPrice implements Comparator<Product> {
    @Override
    public int compare(Product first, Product second) {
        int priceFirstProduct = first.getPrice();
        return priceFirstProduct - second.getPrice();
    }
}
