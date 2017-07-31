package lesson9_10.task3;

abstract class Flower {
    private String name;
    private int date;
    public static int count;

    public Flower(String name, int date) {
        this.name = name;
        this.date = date;
        count++;
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

    abstract public int price();

    public static int costOfBouquet(Flower... flowers) {
        int sum = 0;
        for (Flower f : flowers) {
            sum += f.price();
        }
        return sum;
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
