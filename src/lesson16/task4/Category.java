package lesson16.task4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Category {
    private String name;
    private Set<Product> setProduct;

    public Category(String name, Set<Product> set) {
        this.name = name;
        setProduct = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getSetProduct() {
        return setProduct;
    }

    public void setSetProduct(Set<Product> setProduct) {
        this.setProduct = setProduct;
    }

    public static void printProduct(Set s) {
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
                ", setProduct=" + setProduct +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return setProduct != null ? setProduct.equals(category.setProduct) : category.setProduct == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (setProduct != null ? setProduct.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        ComporatorOfPrice comporatorOfPrice = new ComporatorOfPrice();
        ComporatorOfName comporatorOfName = new ComporatorOfName();
        Set<Product> products1 = new TreeSet<>();
        Set<Product> products2 = new TreeSet<>(comporatorOfPrice);
        Set<Product> products3 = new TreeSet<>(comporatorOfName);
        Product p1 = new Product("Tie", 199, 10);
        Product p2 = new Product("T - short", 250, 8);
        Product p3 = new Product("Watch", 1000, 12);
        products1.add(p1);
        products1.add(p2);
        products1.add(p3);

        products2.add(p2);
        products2.add(p3);

        products3.add(p1);
        products3.add(p2);
        products3.add(p3);

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
