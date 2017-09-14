package lesson21.task1;

public class ProducerDemo {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        Consumer consumer1 = new Consumer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        Thread t1 = new Thread(consumer1);
        t1.setName("First consumer");
        Thread t2 = new Thread(producer);
        t2.setName("Producer");
        Thread t3 = new Thread(consumer2);
        t3.setName("Second consumer");

        t2.start();
        t1.start();
        t3.start();
    }
}
