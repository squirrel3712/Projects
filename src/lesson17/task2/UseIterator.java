package lesson17.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseIterator {
    public static List<HeavyBox> checkBox(List<HeavyBox> box) {
        List<HeavyBox> newBox = new ArrayList<>();
        Iterator<HeavyBox> iterator = box.iterator();
        while (iterator.hasNext()) {
            HeavyBox b = iterator.next();
            if (b.getWeight() > 300) {
                newBox.add(b);
                iterator.remove();
            }
        }
        return newBox;
    }

    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(6, 7, 8, 9);
        HeavyBox box2 = new HeavyBox(9, 67, 89, 9);
        HeavyBox box3 = new HeavyBox(6, 70, 8, 400);
        List<HeavyBox> listOfBox = new LinkedList<>();
        listOfBox.add(box1);
        listOfBox.add(box2);
        listOfBox.add(box3);

        List listNewBox = checkBox(listOfBox);

        for (Object box : listNewBox) {
            System.out.println(box);
        }
    }
}
