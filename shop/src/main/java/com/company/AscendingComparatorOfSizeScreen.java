package com.company;

public class AscendingComparatorOfSizeScreen extends ComparatorOfSizeOfScreen {
    @Override
    public int compare(Devices o1, Devices o2) {
        return o1.getSizeOfScreen() - o1.getSizeOfScreen();
    }
}
