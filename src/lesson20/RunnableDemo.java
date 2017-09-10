package lesson20;

public class RunnableDemo {

    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();
        Thread thread1 = new Thread(newRunnable, "the first thread");
        Thread thread2 = new Thread(newRunnable, "the second thread");
        Thread thread3 = new Thread(newRunnable, "the third thread");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
