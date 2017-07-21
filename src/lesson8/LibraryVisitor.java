package lesson8;

public class LibraryVisitor {
    private String fullName;
    private int idTicket;
    private String faculty;
    private String birthday;
    private String number;

    public LibraryVisitor(String fullName, int idTicket, String faculty, String birthday, String number) {
        this.fullName = fullName;
        this.idTicket = idTicket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.number = number;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " takes " + count + " books");
    }

    public void takeBook(String... nameOfBook) {
        for (String s : nameOfBook) {
            System.out.println(fullName + " takes " + s);
        }
    }

    public void takeBook(Book... b) {
        for (Book s : b) {
            System.out.println(fullName + " takes " + s.name);
        }
    }

    public void returnBook() {
        System.out.println(fullName + " reterns " + Book.count);
    }

    public int returnBook(int count) {
        return count;
    }

    public void returnBook(Book... b) {
        for (Book book : b) {
            System.out.println(fullName + " returns " + book.name);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("It");
        Book b2 = new Book("Candy");
        LibraryVisitor visitor = new LibraryVisitor("Ann", 1, "KIT",
                "16.10.1997", "0990050625");
        visitor.takeBook(4);
        visitor.takeBook("Flowers", "IT successes");
        visitor.takeBook(b1, b2);
        visitor.returnBook();
        visitor.returnBook(b1, b2);
        visitor.returnBook(4);
    }
}
