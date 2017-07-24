package lesson8;

public class UseRecur {
    public static void recur(int from, int to) {
        System.out.print(from + " ");
        if (from == to) {
            return;
        }
        if (from > to) {
            from--;
        } else {
            from++;
        }
        recur(from, to);
    }

    public static void main(String[] args) {
        recur(4, 10);
    }
}
