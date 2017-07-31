package lesson12.task3;

public class TShirt extends Clothes implements ManClothes, WomanClothes {
    @Override
    public String putONMan() {
        return "T-Shirt for man";
    }

    @Override
    public String putONWoman() {
        return "T -Shirt for woman";
    }
}
