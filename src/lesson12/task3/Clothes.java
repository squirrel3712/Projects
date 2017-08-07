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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothes clothes = (Clothes) o;

        if (price != clothes.price) return false;
        if (size != clothes.size) return false;
        return color != null ? color.equals(clothes.color) : clothes.color == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
