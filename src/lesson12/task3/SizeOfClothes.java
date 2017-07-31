package lesson12.task3;

public enum SizeOfClothes {
    XXSn(36) {
        public String getDescription() {
            return "Baby size";
        }
    }, XS(40), S(42), M(44), L(48);

    private int eroSize;

    SizeOfClothes(int eroSize) {
        this.eroSize = eroSize;
    }

    public int getEroSize() {
        return eroSize;
    }

    public String getDescription() {
        return "Adult size";
    }
}
