package lesson21.task1;

public class Consumer implements Runnable {
    MyQueue<Integer> myQueue = new MyQueue<>();

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        for (; ; ) {
            System.out.println(Thread.currentThread().getName() + " ");
            myQueue.get();
        }
    }
}
