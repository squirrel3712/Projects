package lesson18.task2;

import java.util.*;

public class Category {
    private String name;
    private List<Product> products;

    public Category(String name, List<Product> list) {
        this.name = name;
        products = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> setProduct) {
        this.products = setProduct;
    }

    public static void printProduct(List s) {
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", setProduct=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return products != null ? products.equals(category.products) : category.products == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        ComparatorOfName comparatorOfName = new ComparatorOfName();
        ComparatorOfPrice comparatorOfPrice = new ComparatorOfPrice();
        ComporatorOfRaiting comporatorOfRaiting = new ComporatorOfRaiting();

        List<Product> products1 = new ArrayList<>();
        List<Product> products2 = new ArrayList<>();
        List<Product> products3 = new ArrayList<>();

        Product p1 = new Product("Tie", 199, 10);
        Product p2 = new Product("T - short", 250, 8);
        Product p3 = new Product("Watch", 1000, 12);
        products1.add(p1);
        products1.add(p2);
        products1.add(p3);
        Comparator<Product> comparator = Collections.reverseOrder(comporatorOfRaiting);
        Collections.sort(products1, comparator);

        products2.add(p2);
        products2.add(p3);
        Collections.sort(products2, comparatorOfName);

        products3.add(p1);
        products3.add(p2);
        products3.add(p3);
        Collections.sort(products3, comparatorOfPrice);

        Category category1 = new Category("For man", products1);
        Category category2 = new Category("For woman", products2);
        Category category3 = new Category("All staff", products3);

        System.out.println("Catalog for man");
        printProduct(products1);
        System.out.println("Catalog for woman");
        printProduct(products2);
        System.out.println("Catalog of all");
        printProduct(products3);
    }
}
