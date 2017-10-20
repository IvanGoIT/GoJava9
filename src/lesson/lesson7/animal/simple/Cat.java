package lesson.lesson7.animal.simple;

public class Cat extends BaseAnimal {
    public Cat(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public float getWeight() { // кот выглядит очень пушистым, поэтому его масса визуально выглядит на +5 кг
        return super.getWeight() + 5;
    }
}
