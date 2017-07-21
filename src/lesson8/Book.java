package lesson8;

public class Book {
    String name;
    static int count;

    public Book(String name) {
        this.name = name;
        count++;
    }
}
