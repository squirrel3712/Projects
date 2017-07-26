package lesson11;

public class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("Print magazines");
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }

    public static void main(String[] args) {
        Printable[] p = new Printable[3];
        p[0] = new Book();
        p[1] = new Magazine();
        p[2] = new Book();
        printMagazines(p);
        Book.printBooks(p);

    }
}
