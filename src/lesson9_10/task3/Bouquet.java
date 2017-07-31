package lesson9_10.task3;

public class Bouquet {
    public static void main(String[] args) {
        Rose r1 = new Rose("Red rose", 5);
        Rose r2 = new Rose("Red rise", 5);
        Rose r3 = new Rose("Red rise", 5);
        Tulip t1 = new Tulip("Pink tulip", 7);
        Tulip t2 = new Tulip("Pink tulip", 7);

        System.out.println(" Average cost of rose: " + Flower.costOfBouquet(r1, r2, r3));
        System.out.println(" Average cost of tulip: " + Flower.costOfBouquet(t1, t1));
        System.out.println(" Average cost of flowers: " + Flower.costOfBouquet(r1, r2, r3, t1, t2));
        System.out.println("Count of sold flowers " + Flower.count);
    }
}
