package main.java;

public class DescendingComparatorOfWeight extends ComparatorOfWeight {
    @Override
    public int compare(Devices o1, Devices o2) {
        return o2.getWeight() - o1.getWeight();
    }
}
