package lesson9_10;

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    void makeNoise() {
        System.out.println("Мяуу");
    }

    @Override
    void eat() {
        System.out.println("I like eating " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return color != null ? color.equals(cat.color) : cat.color == null;
    }
}
