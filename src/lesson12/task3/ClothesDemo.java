package lesson12.task3;

public class ClothesDemo {
    public static void main(String[] args) {
        Clothes[] clothes = {new TShirt(), new Trousers(), new Tie()};
        Studio studio = new Studio();
        studio.putOnMan(clothes);
        studio.putOnWoman(clothes);
    }
}
