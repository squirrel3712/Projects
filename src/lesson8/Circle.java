package lesson8;

public class Circle {
    private double radius;
    private double diametr;
    public final static double PI = 3.14159265359;

    Circle(double radius) {
        this.radius = radius;
        diametr = 2 * this.radius;
    }

    public double scircle() {
        return PI * (radius * radius);
    }

    public double lcircle() {
        return PI * diametr;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(5);
        System.out.println("Площадь для круга с1 :" + c1.scircle());
        System.out.println("Площадь для круга с2 :" + c2.scircle());
        System.out.println("Длина окружности для с1 :" + c1.lcircle());
        System.out.println("Длина окружности для с2 :" + c2.lcircle());
    }
}
