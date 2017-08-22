package lesson16.task1_2;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeavyBox1 implements Comparable<HeavyBox1> {
    private int weight, height, depth, width;

    public HeavyBox1() {
    }

    public HeavyBox1(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox1{" +
                "weight=" + weight +
                ", height=" + height +
                ", depth=" + depth +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeavyBox1 heavyBox = (HeavyBox1) o;

        if (weight != heavyBox.weight) return false;
        if (height != heavyBox.height) return false;
        if (depth != heavyBox.depth) return false;
        return width == heavyBox.width;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + height;
        result = 31 * result + depth;
        result = 31 * result + width;
        return result;
    }

    public static void main(String[] args) {
        HeavyBox1 box1 = new HeavyBox1(10, 10, 9, 8);
        HeavyBox1 box2 = new HeavyBox1(108, 70, 8, 12);
        SortedSet<HeavyBox1> set = new TreeSet<>();
        set.add(box1);
        set.add(box2);
        for (HeavyBox1 heavyBox : set) {
            System.out.println(heavyBox);
        }
    }

    @Override
    public int compareTo(HeavyBox1 anotherBox) {
        int anotherBoxWeight = anotherBox.weight;
        return anotherBoxWeight - this.weight;
    }
}
