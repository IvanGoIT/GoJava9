package lesson.lesson8;

import lesson.lesson8.products.NoSalable;
import lesson.lesson8.products.Sale;
import lesson.lesson8.products.SuperProduct;
import lesson.lesson8.products.cloth.DressProduct;
import lesson.lesson8.products.cloth.JeansProduct;
import lesson.lesson8.products.food.BananaProduct;
import lesson.lesson8.products.food.CakeProduct;

public class PolymorphismExample {

    public static void main(String[] args) {
        SuperProduct[] products = new SuperProduct[] {
                new BananaProduct(10, "хороший банан", 180),
                new CakeProduct(11, "хороший торт", 350, 3),
                new DressProduct(0, "плохое платье"),
                new JeansProduct(100, "Синие штаны")
        };

        for (SuperProduct product : products) {
            product.show();

            // 0 == 0
            // "" == int
            if (product instanceof CakeProduct) {
                CakeProduct cake = (CakeProduct)product;
                cake.setName("плохо торт");
                product.show();
                System.out.println("Торт найден! и имеет " + cake.getCountOfFires() + " свечей");
            }

            if (product instanceof NoSalable) {
                System.out.println("Этот продукт не продается - " + product.getName());
            }

            if (product instanceof Sale) {
                Sale sale = (Sale)product;
                System.out.println("Вам повезло, на этот товар скидка в размере - " + (sale.getSale() * 100) + "%");
            }
        }
    }
}
