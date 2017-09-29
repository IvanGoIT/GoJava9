package question.question5;


// public       есть доступ снаружи
// protected    есть доступ только у наследников и нету снаружи
// private      нету доступа снаружи
// -- default

// Класс может иметь модификаторы доступа:
// public
// default

public class ClassAccessExample {

    // Вложенный класс может иметь модификаторы доступа:
    // public
    // protected
    // private
    // default
    protected static class NestedClassExample {

    }

    public ClassAccessExample() {
        NestedClassExample example = new NestedClassExample();
    }
}
