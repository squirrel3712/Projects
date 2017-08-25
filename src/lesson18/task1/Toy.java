package lesson18.task1;

public class Toy {
    private String name;
    private int сost;

    public Toy(String name, int сost) {
        this(name);
        this.сost = сost;
        System.out.println("In constructor with two parameters");
    }

    public Toy(String name) {
        this();
        this.name = name;
        System.out.println("In constructor with one parameter");
    }

    public Toy() {
        System.out.println("In default constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getСost() {
        return сost;
    }

    public void setСost(int сost) {
        this.сost = сost;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", сost=" + сost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (сost != toy.сost) return false;
        return name != null ? name.equals(toy.name) : toy.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + сost;
        return result;
    }
}
