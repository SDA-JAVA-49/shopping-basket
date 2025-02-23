package al.sda.app.basket.service;

import al.sda.app.basket.model.Product;
import al.sda.app.basket.repository.BasketRepository;

import java.util.List;

public class BasketService {
    private BasketRepository repository;

    public BasketService(BasketRepository repository) {
        this.repository = repository;
    }

    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    public void removeProduct(Product product) {
        repository.removeProduct(product);
    }

    public List<Product> getProducts() {
        return repository.getProducts();
    }
}
