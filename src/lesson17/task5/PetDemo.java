package lesson17.task5;

import java.util.HashMap;
import java.util.Map;

public class PetDemo {
    public static void main(String[] args) {
        Pet cat = new Cat("Мурка");
        Pet dog = new Dog("Гоша");
        Pet parrot = new Parrot("Кеша");

        Map<String, Pet> pets = new HashMap<>();
        pets.put(cat.getName(), cat);
        pets.put(dog.getName(), dog);
        pets.put(parrot.getName(), parrot);

        Pet.printPets(pets);
    }
}
