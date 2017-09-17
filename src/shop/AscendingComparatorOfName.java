package shop;

public class AscendingComparatorOfName extends ComparatorOfName {

    @Override
    public int compare(Devices o1, Devices o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
