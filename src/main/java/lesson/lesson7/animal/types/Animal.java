package lesson.lesson7.animal.types;

// public -- видно везде
// private -- видно только внутри
// protected -- видно внутри и внутри наследников

import lesson.lesson7.animal.CanShow;

public abstract class Animal implements CanShow {
    protected String name;
    private int age;
    private float weight;

    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void movement();

    @Override
    public void show() {
        System.out.println();
        System.out.println("\t name:    " + getName());
        System.out.println("\t age:     " + getAge());
        System.out.println("\t weight:  " + getWeight());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
