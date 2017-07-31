package lesson12.task3;

public abstract class Clothes {
    private String color;
    private int price, size;

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
