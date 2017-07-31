package lesson12.task1;

public enum Seasons {
    WINTER(-30), SPRING(18), SUMMER(30) {
        @Override
        public String getDescription() {
            return "There is a hot weather";
        }
    }, AUTUMN(15);

    Seasons(int temp) {
        this.temp = temp;
    }

    private int temp;

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return "There is a cold weather";
    }
}
