package lesson.lesson8.products.food;

import lesson.lesson8.products.NoSalable;

public class BananaProduct extends SuperFoodProduct implements NoSalable {

    public BananaProduct(int id, String name, int expiration) {
        super(id, name, expiration);
    }
}
