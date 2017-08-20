package lesson17;

import java.util.ArrayDeque;
import java.util.Deque;

public class DemoDeque {
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(6, 7, 8, 9);
        HeavyBox box2 = new HeavyBox(9, 67, 89, 9);
        HeavyBox box3 = new HeavyBox(6, 70, 8, 99);
        Deque<HeavyBox> deque = new ArrayDeque<>();
        deque.offer(box1);
        deque.offer(box2);
        deque.offer(box3);

        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
    }
}
