package main.java;

public class DescendindComparatorOfSizeScreen extends ComparatorOfSizeOfScreen {
    @Override
    public int compare(Devices o1, Devices o2) {
        return o2.getSizeOfScreen() - o1.getSizeOfScreen();
    }
}
