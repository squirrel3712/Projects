package lesson9_10.task4;

public class Dog extends Animal {
    private int age;

    public Dog(String food, String location, int age) {
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
    public void makeNoise() {
        System.out.println("Gav-Gav");
    }

    @Override
    public void eat() {
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
