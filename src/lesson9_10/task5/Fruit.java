package lesson9_10.task5;

abstract public class Fruit {
    private int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract public int getPrice();

    final public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public static int sumOfFruit(Apple apple, Apricot apricot, Pear pear)
    {
        return apple.costOfApple()+apricot.costOfApricot()+pear.costOfPear();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
