package lesson21.task1;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue<T extends Number> {
    Queue<T> queue;

    public MyQueue() {
        queue = new ArrayDeque<>();
    }

    public synchronized T get() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пoлyчeнo: " + queue.peek());
        return queue.poll();
    }

    public synchronized void put(T product) {
        queue.offer(product);
        System.out.println("Oтпpaвлeнo : " + queue.peek());
        notify();
    }
}
