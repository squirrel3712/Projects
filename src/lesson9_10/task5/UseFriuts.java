package lesson9_10.task5;

public class UseFriuts {
    public static void main(String[] args) {
        Apple apple1 = new Apple (2);
        Apple apple2 = new Apple (2);
        Apricot apricot = new Apricot(3);
        Pear pear = new Pear(2);

        System.out.println("Общая стоимость проданных яблок = " + apple1.costOfApple(apple1,apple2));
        System.out.println("Общая стоимость проданных груш = " + pear.costOfPear(pear));
        System.out.println("Общая стоимость проданных абрикос = " +apricot.costOfApricot(apricot));
        System.out.println("Общая выручка = " + Fruit.sumOfFruit(apple1,apricot,pear));
        apple1.printManufacturerInfo();
    }
}
