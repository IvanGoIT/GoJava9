package lesson.lesson7.animal.simple;

public class Cat extends BaseAnimal {
    public Cat(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public float getWeight() {
        return super.getWeight() + 5;
    }
}
