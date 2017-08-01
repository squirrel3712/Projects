package lesson12.task3;

public class Tie extends Clothes implements ManClothes {
    @Override
    public void putOnMan() {
        System.out.println("Tie for man");
    }
}
