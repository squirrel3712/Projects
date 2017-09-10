package lesson20;

public class ThreadSynchDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");
        ThreadSynch threadSynch1 = new ThreadSynch(stringBuilder);
        ThreadSynch threadSynch2 = new ThreadSynch(stringBuilder);
        ThreadSynch threadSynch3 = new ThreadSynch(stringBuilder);

        threadSynch1.start();
        threadSynch2.start();
        threadSynch3.start();
    }
}
