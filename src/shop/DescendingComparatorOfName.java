package shop;

public class DescendingComparatorOfName extends ComparatorOfName {
    @Override
    public int compare(Devices o1, Devices o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
