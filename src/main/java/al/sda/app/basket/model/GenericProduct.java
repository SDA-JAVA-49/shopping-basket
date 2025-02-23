package al.sda.app.basket.model;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product{
    private Supplier<Double> getPrice;
    private Function<LocalDate, Boolean> isAvailable;

    public GenericProduct(Supplier<Double> getPrice, Function<LocalDate, Boolean> isAvailable) {
        this.getPrice = getPrice;
        this.isAvailable = isAvailable;
    }

    @Override
    public Double getPrice() {
        return getPrice.get();
    }

    @Override
    public boolean isAvailable(LocalDate date) {
        return isAvailable.apply(date);
    }

}
