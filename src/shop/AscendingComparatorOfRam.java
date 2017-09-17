package shop;

public class AscendingComparatorOfRam extends ComparatorOfRam {
    @Override
    public int compare(Devices o1, Devices o2) {
        return o1.getRam() - o2.getRam();
    }
}
