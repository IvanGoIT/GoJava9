package lesson.lesson7.animal.types;

public class AnimalBirds extends Animal {
    public AnimalBirds(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public void movement() {
        System.out.println("двигаемся на крыльях");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("\t movement:" + "крылья");
    }
}
