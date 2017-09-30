package main.java;

public class AscendingComparatorOfWeight extends ComparatorOfWeight {
    @Override
    public int compare(Devices o1, Devices o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
