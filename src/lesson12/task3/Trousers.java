package lesson12.task3;

public class Trousers extends Clothes implements ManClothes, WomanClothes {
    @Override
    public void putOnMan() {
        System.out.println("Trousers for man");
    }

    @Override
    public void putOnWoman() {
        System.out.println("Trousers for woman");
    }
}
