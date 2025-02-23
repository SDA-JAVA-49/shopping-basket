package al.sda.app.basket.model;

import java.time.LocalDate;

public interface Product {
    Double getPrice();
    boolean isAvailable(LocalDate date);
}
