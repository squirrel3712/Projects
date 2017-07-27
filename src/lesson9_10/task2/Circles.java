package lesson9_10.task2;

public class Circles extends Shape {
    private int x, y, radius;

    public Circles(String color){
        setColor(color);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        System.out.println("Circle has color - " + getColor());
        return getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circles circles = (Circles) o;

        if (x != circles.x) return false;
        if (y != circles.y) return false;
        return radius == circles.radius;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Circles{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
