package lesson9_10;

public class UseFriuts {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Pear pear = new Pear();
        Apricot apricot1 = new Apricot();
        Apricot apricot2 = new Apricot();
        System.out.println("Общая стоимость проданных яблок = " + apple1.sumOfApple());
        System.out.println("Общая стоимость проданных груш = " + pear.sumOfPear());
        System.out.println("Общая стоимость проданных абрикос = " + apricot1.sumOfApricot());
        System.out.println("Общая выручка = " + apple1.sumOfFruit(apple1, pear, apricot1));
    }
}
