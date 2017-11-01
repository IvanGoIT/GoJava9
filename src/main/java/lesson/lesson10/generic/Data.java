package lesson.lesson10.generic;

import lesson.lesson7.animal.simple.BaseAnimal;

import java.util.Collection;

public class Data<T extends Number> {
    public String name;
    public T number;
}
