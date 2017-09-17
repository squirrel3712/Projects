package lesson21.task2;

public class Philosopher implements Runnable {
    private Fork f1, f2;

    public Philosopher(Fork f1, Fork f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public void eat() {
        f1.take();
        f2.take();
        try {
            System.out.println(Thread.currentThread().getName() + "is eating");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void think() {
        f1.put();
        f2.put();
        try {
            System.out.println(Thread.currentThread().getName() + "thinks");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {
        synchronized (f1) {
            synchronized (f2) {
                eat();
                think();
            }
        }
    }
}
