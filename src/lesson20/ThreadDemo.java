package lesson20;

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread newThread1 = new NewThread();
        NewThread newThread2 = new NewThread();
        newThread1.setName("1 thread");
        newThread2.setName("2 thread");
        newThread1.start();
        newThread2.start();
    }
}
