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
        for (Iterator i = s.iterator(); i.hasNext(); ) {
            System.out.println(i.next() + " ");
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
        ComporatorDemo comporator = new ComporatorDemo();
        Set<Product> setOfProduct1 = new TreeSet<>();
        Set<Product> setOfProduct2 = new TreeSet<>(comporator);
        Product p1 = new Product("Tie", 199, 10);
        Product p2 = new Product("T - short", 250, 8);
        Product p3 = new Product("Watch", 1000, 12);
        setOfProduct1.add(p1);
        setOfProduct1.add(p2);
        setOfProduct1.add(p3);

        setOfProduct2.add(p2);
        setOfProduct2.add(p3);

        Category category1 = new Category("For man", setOfProduct1);
        Category category2 = new Category("For woman", setOfProduct2);

        System.out.println("Catalog for man");
        printProduct(setOfProduct1);
        System.out.println("Catalog for woman");
        printProduct(setOfProduct2);
    }
}
