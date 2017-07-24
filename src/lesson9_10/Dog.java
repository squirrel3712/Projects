package lesson9_10;

public class Dog extends Animal {
    private int age;

    Dog(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void makeNoise() {
        System.out.println("Gav-Gav");
    }

    @Override
    void eat() {
        System.out.println("I like eating " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return age == dog.age;
    }
}
