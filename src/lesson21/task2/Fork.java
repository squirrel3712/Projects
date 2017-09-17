package lesson21.task2;

public class Fork {
    private boolean isBusy;
    private int id;
    private static int count = 0;

    public Fork() {
        isBusy = false;
        id = ++count;
    }

    public synchronized void put() {
        System.out.println(Thread.currentThread().getName() + " put " + id + " fork");
        isBusy = false;
        notify();
    }

    public synchronized void take() {
        try {
            if (isBusy) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        isBusy = true;
        System.out.println(Thread.currentThread().getName() + " took " + id + " fork");
    }

}
