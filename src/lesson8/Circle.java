package lesson8;

public class Circle {
    private double radius;
    private double diametr;
    public final static double PI = 3.14159265359;

    Circle(double radius) {
        this.radius = radius;
        diametr = 2 * this.radius;
    }

    public double SCircle() {
        return PI * (radius * radius);
    }

    public double LCircle() {
        return PI * diametr;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(5);
        System.out.println("Площадь для круга с1 :" + c1.SCircle());
        System.out.println("Площадь для круга с2 :" + c2.SCircle());
        System.out.println("Длина окружности для с1 :" + c1.LCircle());
        System.out.println("Длина окружности для с2 :" + c2.LCircle());
    }
}
