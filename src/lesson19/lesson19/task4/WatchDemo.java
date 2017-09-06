package lesson19.task4;

public class WatchDemo {
    public static void main(String[] args) {
        WatchContextOfFile watchContextOfFile = new WatchContextOfFile();
        watchContextOfFile.watchContext("src/lesson19", 0);
    }
}
