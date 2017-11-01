package lesson.lesson8.products.food;

import lesson.lesson8.products.NoSalable;

public class CocaColaProduct extends SuperFoodProduct implements NoSalable {
    public CocaColaProduct(int id, String name, int expiration) {
        super(id, name, expiration);
    }
}
