package lesson.lesson8.products.food;

public class CakeProduct extends SuperFoodProduct {

    private int countOfFires;

    public CakeProduct(int id, String name, int expiration, int countOfFires) {
        super(id, name, expiration);
        this.countOfFires = countOfFires;
    }

    public int getCountOfFires() {
        return countOfFires;
    }

    public void setCountOfFires(int countOfFires) {
        this.countOfFires = countOfFires;
    }
}
