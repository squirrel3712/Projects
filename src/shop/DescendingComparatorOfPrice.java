package shop;

public class DescendingComparatorOfPrice extends ComparatorOfPrice {
    @Override
    public int compare(Devices o1, Devices o2) {
        return o2.getCost() - o1.getCost();
    }
}
