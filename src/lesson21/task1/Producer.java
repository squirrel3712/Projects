package lesson21.task1;

public class Producer implements Runnable {
    MyQueue<Integer> myQueue = new MyQueue<>();

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        for (; ; ) {
            System.out.println(Thread.currentThread().getName() + " put");
            myQueue.put(1);
        }
    }
}
