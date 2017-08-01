package lesson9_10.task3;

public class Tulip extends Flower {
    public static final int COST_OF__ROSE = 150;

    public Tulip(String name, int date) {
        super(name, date);
    }

    @Override
    public int price() {
        return COST_OF__ROSE;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
