package al.sda.app;

import al.sda.app.basket.model.GenericProduct;
import al.sda.app.basket.model.Product;
import al.sda.app.basket.repository.BasketRepository;
import al.sda.app.basket.service.BasketService;

public class Application {
    public static void main(String[] args){
        BasketRepository basketRepository = new BasketRepository();

        Product pasta = new GenericProduct();
        Product apple = new GenericProduct();
        Product rice = new GenericProduct();
        Product milk = new GenericProduct();

        basketRepository.addProduct(pasta);
        basketRepository.addProduct(apple);
        basketRepository.addProduct(rice);
        basketRepository.addProduct(milk);


    }
}
