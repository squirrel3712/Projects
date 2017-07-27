package lesson9_10.task4;

public class Vet {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }

    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog("bones", "home", 1);
        animal[1] = new Cat("milk", "home", "white");
        animal[2] = new Horse("hay", "field", "black");
        for (Animal an : animal) {
            treatAnimal(an);
        }
    }
}
