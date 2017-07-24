package lesson9_10;

public abstract class Animal {
    private String food;
    private String location;

    Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    abstract void makeNoise();

    abstract void eat();

    public void sleep() {
        System.out.println("I can sleep");
    }
}
