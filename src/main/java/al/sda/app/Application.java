package al.sda.app;

import al.sda.app.basket.model.GenericProduct;
import al.sda.app.basket.model.Product;
import al.sda.app.basket.repository.BasketRepository;
import al.sda.app.basket.service.BasketService;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        LocalDate expirationDate = LocalDate.of(2025, 2, 28);
        Product apple = new GenericProduct(() -> 1.99,
                date -> LocalDate.now().isBefore(expirationDate));
        Product banana = new GenericProduct(() -> 2.00,
                date -> LocalDate.now().isBefore(expirationDate));
        Product avocado = new GenericProduct(() -> 2.50,
                date -> LocalDate.now().isBefore(expirationDate));

        BasketRepository basketRepository = new BasketRepository();
        BasketService basketService = new BasketService(basketRepository);

        basketService.addProduct(apple);
        basketService.addProduct(banana);
        basketService.addProduct(avocado);

        System.out.println("Basket contains: ");
        for (Product product : basketService.getProducts()){
            System.out.println("Price: " + product.getPrice() + ", " + "Availability today: " + product.isAvailable(LocalDate.now()));
        }
    }
}
