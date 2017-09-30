package main.java;

public class DescendingComparatorOfRam extends ComparatorOfRam {
    @Override
    public int compare(Devices o1, Devices o2) {
        return o2.getRam() - o1.getRam();
    }
}
