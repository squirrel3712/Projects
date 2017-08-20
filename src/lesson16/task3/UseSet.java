package lesson16.task3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseSet {
    public static Set union(Set s1, Set s2) {
        Set s3 = new HashSet(s1);
        s3.addAll(s2);
        return s3;
    }

    public static Set intersect(Set s1, Set s2) {
        Set s3 = new HashSet(s1);
        Set s4 = new HashSet(s2);
        s3.retainAll(s4);
        return s3;
    }

    public static void printSet(Set s) {
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(2);
        s1.add(6);
        s1.add(1);
        s1.add(101);

        Set<Integer> s2 = new HashSet<>();
        s2.add(7);
        s2.add(9);
        s2.add(1);
        s2.add(101);
        s2.add(66);

        printSet(union(s1, s2));
        printSet(intersect(s1, s2));
    }
}
