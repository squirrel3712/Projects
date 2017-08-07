package lesson12.task3;

public class Studio {
    public void putOnMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).putOnMan();
            }
        }
    }

    public void putOnWoman(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomanClothes) {
                ((WomanClothes) c).putOnWoman();
            }
        }
    }
}
