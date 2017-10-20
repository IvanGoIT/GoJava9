package question.question8;

import question.question8.example.ChildClass;
import question.question8.example.SuperClass;

public class WorkingWithClassExample {

    public static void main(String[] args) {
        SuperClass sp = new ChildClass("Super User");
        ((ChildClass)sp).show();
    }
}
