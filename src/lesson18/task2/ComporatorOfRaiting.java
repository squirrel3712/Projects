package lesson18.task2;

import java.util.Comparator;

public class ComporatorOfRaiting implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getRaiting() - o2.getRaiting();
    }
}
