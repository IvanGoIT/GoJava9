package lesson.lesson7.animal.simple;

public class Snake extends BaseAnimal {
    private float length;

    public Snake() {
        this(null, 0, 0);
    }

    public Snake(String name, int age, float weight) {
        // Вариант 1
        // super(name, age, weight);
        // this.length = 10;
        // ---------------------------

        // Вариант 2 (лучше)
        this(name, age, weight, 10);
        // ---------------------------
    }

    public Snake(String name, int age, float weight, float length) {
        super(name, age, weight);
        this.length = length;
    }

    public void doSomething() {
        name = "";
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
