package lesson.lesson8.products.cloth;

import lesson.lesson8.products.NoSalable;

public class DressProduct extends SuperClothProduct implements NoSalable {
    public DressProduct(int id, String name) {
        super(id, name);
    }
}
