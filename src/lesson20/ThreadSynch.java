package lesson20;

public class ThreadSynch extends Thread {
    private StringBuilder stringBuilder;

    public ThreadSynch(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuilder+ " ");
            }
            System.out.println();
            char ch = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++ch);
        }
    }
}
