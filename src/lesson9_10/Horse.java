package lesson9_10;

public class Horse extends Animal {
    private String colorOfMane;

    Horse(String food, String location, String colorOfMane) {
        super(food, location);
        this.colorOfMane = colorOfMane;
    }

    public String getColorOfMane() {
        return colorOfMane;
    }

    public void setColorOfMane(String colorOfMane) {
        this.colorOfMane = colorOfMane;
    }

    @Override
    void makeNoise() {
        System.out.println("Фррр");
    }

    @Override
    void eat() {
        System.out.println("i like eating " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horse horse = (Horse) o;

        return colorOfMane != null ? colorOfMane.equals(horse.colorOfMane) : horse.colorOfMane == null;
    }
}
