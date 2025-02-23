package al.sda.app.basket.repository;

import al.sda.app.basket.model.Product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BasketRepository {
    private final List<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        List<Product> result = new LinkedList<>();
        Collections.copy(result, products);
        return result;
    }
}
