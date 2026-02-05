import java.util.*;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class SortMethodRefDemo {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product(3, "Mouse"),
            new Product(1, "Keyboard"),
            new Product(2, "Monitor")
        );

        System.out.println("Before Sorting:");
        System.out.println(products);

        // Using Method Reference
        products.sort(Comparator.comparing(Product::getName));

        System.out.println("After Sorting:");
        System.out.println(products);
    }
}
