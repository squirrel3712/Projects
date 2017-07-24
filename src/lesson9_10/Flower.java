package lesson9_10;

abstract class Flower {
    private String name;
    private int date;
    public static int count;

    Flower(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    abstract int price();

    public void printState() {
        System.out.println(name + " costs " + price());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (date != flower.date) return false;
        return name != null ? name.equals(flower.name) : flower.name == null;
    }
}
