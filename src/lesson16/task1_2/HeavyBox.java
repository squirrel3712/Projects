package lesson16.task1_2;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    private int weight, height, depth, width;

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
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

        HeavyBox heavyBox = (HeavyBox) o;

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
        HeavyBox box1 = new HeavyBox(10, 10, 9, 8);
        HeavyBox box2 = new HeavyBox(108, 70, 8, 12);
        List<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(box1);
        arrayList.add(box2);
        System.out.println("Size of arrayList =  " + arrayList.size());
        System.out.println("Index of box1 = " + arrayList.indexOf(box1));
        System.out.println("Index of box2 = " + arrayList.indexOf(box2));
        System.out.println(arrayList.contains(box1));
        System.out.println(arrayList.remove(0));
        System.out.println("Size of arrayList =  " + arrayList.size());
        for (HeavyBox array : arrayList) {
            System.out.println(array.toString());
        }
    }
}
