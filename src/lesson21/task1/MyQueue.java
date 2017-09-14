package lesson21.task1;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue<T extends Number> {
    Queue<T> queue;
    boolean valueSet = false;

    public MyQueue() {
        queue = new ArrayDeque<>();
    }

    public synchronized T get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пoлyчeнo: " + queue.peek());
        valueSet = false;
        notify();
        return queue.poll();
    }

    public synchronized void put(T product) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        queue.offer(product);
        System.out.println("Oтпpaвлeнo : " + queue.peek());
        notify();
    }
}
