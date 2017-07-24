package lesson9_10;

public class Bouquet {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        flowers[0] = new Rose("Rose red", 10);
        flowers[1] = new Tulip("Tilip pink", 5);
        flowers[2] = new Rose("Rose red", 10);
        for (Flower f : flowers) {
            f.printState();
        }
        System.out.println();

        Flower[] flowers1 = new Flower[3];
        flowers1[0] = new Rose("Rose red", 10);
        flowers1[1] = new Tulip("Rose red", 10);
        flowers1[2] = new Rose("Rose red", 10);
        for (Flower f : flowers1) {
            f.printState();
        }
        System.out.println();

        Flower[] flowers2 = new Flower[5];
        flowers2[0] = new Rose("Tulip pink", 5);
        flowers2[1] = new Tulip("Tilip pink", 5);
        flowers2[2] = new Rose("Tulip pink", 5);
        flowers2[3] = new Tulip("Tilip pink", 5);
        flowers2[4] = new Rose("Tulip pink", 5);
        for (Flower f : flowers2) {
            f.printState();
        }
        System.out.println("Count of sold flowers " + Flower.count);
    }
}
