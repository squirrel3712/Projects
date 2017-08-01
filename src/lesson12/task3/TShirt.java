package lesson12.task3;

public class TShirt extends Clothes implements ManClothes, WomanClothes {
    @Override
    public void putOnMan() {
        System.out.println("T-Shirt for man");
    }

    @Override
    public void putOnWoman() {
        System.out.println("T -Shirt for woman");
    }
}
