package lesson16.task4;

import java.util.Comparator;

public class ComporatorDemo implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.compareTo(o1);
    }
}
