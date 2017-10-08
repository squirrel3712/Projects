package com.company;

public class AscendingComparatorOfPrice extends ComparatorOfPrice{
    @Override
    public int compare(Devices o1, Devices o2) {
        return o1.getCost() - o2.getCost();
    }
}
