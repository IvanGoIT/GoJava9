package lesson.lesson8.products.cloth;

import lesson.lesson8.products.Sale;

public class JeansProduct extends SuperClothProduct implements Sale {
    public JeansProduct(int id, String name) {
        super(id, name);
    }

    @Override
    public float getSale() {
        return 0.5f; // 50%
    }
}
