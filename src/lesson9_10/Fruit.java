package lesson9_10;

abstract public class Fruit {
    abstract public int getPrice();

    final public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public int sumOfFruit(Apple apple, Pear pear, Apricot apricot) {
        return apple.sumOfApple() + pear.sumOfPear() + apricot.sumOfApricot();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
