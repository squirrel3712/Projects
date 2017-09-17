package lesson21.task2;

public class DemoPhilosopher {
    public static void main(String[] args) {
        Fork[] forks = new Fork[]{new Fork(), new Fork(), new Fork(), new Fork(), new Fork()};
        Thread t1 = new Thread(new Philosopher(forks[4], forks[0]));
        Thread t2 = new Thread(new Philosopher(forks[0], forks[1]));
        Thread t3 = new Thread(new Philosopher(forks[2], forks[1]));
        Thread t4 = new Thread(new Philosopher(forks[2], forks[3]));
        Thread t5 = new Thread(new Philosopher(forks[4], forks[3]));

        t1.setName("The first philosopher");
        t2.setName("The second philosopher");
        t3.setName("The third philosopher");
        t4.setName("The four philosopher");
        t5.setName("The five philosopher");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
