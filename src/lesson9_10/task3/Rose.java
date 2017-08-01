package lesson9_10.task3;

public class Rose extends Flower {
    public static final int COST_OF__ROSE = 100;

    public Rose(String name, int date) {
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
