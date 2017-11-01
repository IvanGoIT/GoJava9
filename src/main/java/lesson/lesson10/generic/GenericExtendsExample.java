package lesson.lesson10.generic;

import lesson.lesson10.enumeration.User;
import lesson.lesson7.animal.simple.Cat;

import java.util.ArrayList;

public class GenericExtendsExample {
    public static void main(String[] args) {
        // Data<User> wrongData = new Data<>();                 // compilation error
        // Data<ArrayList<User>> wrongData2 = new Data<>();     // compilation error


        Data<Float> data;
        Data<Integer> data2;

        Data<Integer> data3;
    }
}
