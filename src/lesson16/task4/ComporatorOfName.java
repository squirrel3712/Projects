package lesson16.task4;

import java.util.Comparator;

public class ComporatorOfName implements Comparator<Product> {
    @Override
    public int compare(Product first, Product second) {
        return second.getName().compareTo(first.getName());
    }
}
