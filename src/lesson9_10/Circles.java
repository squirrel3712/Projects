package lesson9_10;

public class Circles extends Shape {
    private int x, y, radius;
    private String color;

    public Circles(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
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
        System.out.println("Circle has color - " + color);
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circles circles = (Circles) o;

        if (x != circles.x) return false;
        if (y != circles.y) return false;
        if (radius != circles.radius) return false;
        return color.equals(circles.color);
    }
}
