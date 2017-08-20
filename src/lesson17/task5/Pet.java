package lesson17.task5;

import java.util.Map;

public class Pet {
    private String name;

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printPets(Map<String,Pet> pets){
        for(Pet pet: pets.values()){
            System.out.println(pet.getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        return name != null ? name.equals(pet.name) : pet.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
