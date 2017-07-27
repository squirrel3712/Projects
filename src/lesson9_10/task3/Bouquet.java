package lesson9_10.task3;

public class Bouquet {
    public static void main(String[] args) {
        Flower[] flowers1 = new Flower[3];
        flowers1[0] = new Rose("Rose red", 10);
        flowers1[1] = new Tulip("Tilip pink", 5);
        flowers1[2] = new Rose("Rose red", 10);
        for (Flower f : flowers1) {
            f.printState();
        }
        System.out.println("Cost of bouquet: " + Flower.costOfBouquet(flowers1));
        System.out.println();

        Flower[] flowers2 = new Flower[3];
        flowers2[0] = new Rose("Rose red", 10);
        flowers2[1] = new Tulip("Rose red", 10);
        flowers2[2] = new Rose("Rose red", 10);
        for (Flower f : flowers2) {
            f.printState();
        }
        System.out.println("Cost of bouquet: " + Flower.costOfBouquet(flowers2));
        System.out.println();

        Flower[] flowers3 = new Flower[5];
        flowers3[0] = new Rose("Tulip pink", 5);
        flowers3[1] = new Tulip("Tilip pink", 5);
        flowers3[2] = new Rose("Tulip pink", 5);
        flowers3[3] = new Tulip("Tilip pink", 5);
        flowers3[4] = new Rose("Tulip pink", 5);
        for (Flower f : flowers3) {
            f.printState();
        }
        System.out.println("Cost of bouquet: " + Flower.costOfBouquet(flowers3));
        System.out.println("Count of sold flowers " + Flower.count);
    }
}
