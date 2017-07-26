package lesson11;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Print books");
    }

    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
}
