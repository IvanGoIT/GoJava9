package lesson.lesson8.products.food;

import lesson.lesson8.products.SuperProduct;

public class SuperFoodProduct extends SuperProduct {

    private int expiration;

    public SuperFoodProduct(int id, String name, int expiration) {
        super(id, name);
        this.expiration = expiration;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("испортится через " + expiration + " дней");
    }
}
