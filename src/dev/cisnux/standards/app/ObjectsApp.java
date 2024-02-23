package dev.cisnux.standards.app;

import java.util.Objects;

public class ObjectsApp {
    private static record Product(String name, int price) {
    }

    public static void main(String[] args) {
        final Product product1 = new Product("baygon",2_000);
        Product product = null;

        // bcs product is null it will throw null pointer exception
//        System.out.println(product.toString());
//        System.out.println(product.equals(product1));
        System.out.println(Objects.toString(product));
        System.out.println(Objects.equals(product, product1));
        System.out.println(product1);
    }
}
