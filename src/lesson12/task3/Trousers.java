package lesson12.task3;

public class Trousers extends Clothes implements ManClothes, WomanClothes {
    @Override
    public String putONMan() {
        return "Trousers for man";
    }

    @Override
    public String putONWoman() {
        return "Trousers for woman";
    }
}
