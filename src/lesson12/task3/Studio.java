package lesson12.task3;

public class Studio {
    public void putOnMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof TShirt) {
                ((TShirt) c).putOnMan();
            }
            if (c instanceof Trousers) {
                ((Trousers) c).putOnMan();
            }
            if (c instanceof Tie) {
                ((Tie) c).putOnMan();
            }
        }
    }

    public void putOnWoman(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof TShirt) {
                ((TShirt) c).putOnWoman();
            }
            if (c instanceof Trousers) {
                ((Trousers) c).putOnWoman();
            }
        }

    }
}
