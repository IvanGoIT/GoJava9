package lesson.lesson10.json;

import com.alibaba.fastjson.JSON;
import lesson.lesson10.enumeration.Gender;
import lesson.lesson10.enumeration.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JSONExample {

    static void simpleExample() {
        System.out.println("--------------------------------------");
        System.out.println("Simple example");
        System.out.println();

        User user = new User("Петя", Gender.male, 20);
        String json = JSON.toJSONString(user);

        System.out.println(json);
        System.out.println();
    }

    static void groupExample() {
        System.out.println("--------------------------------------");
        System.out.println("Group example");
        System.out.println();

        UserGroup group = new UserGroup();
        group.name = "Класс А";
        group.users.add(new User("Петя", Gender.male, 20));
        group.users.add(new User("Коля", Gender.male, 20));
        group.users.add(new User("Маша", Gender.female, 20));
        group.users.add(new User("X", Gender.unknown, 5));

        String json = JSON.toJSONString(group);

        System.out.println(json);
        System.out.println();
    }

    static void userReadExample() throws FileNotFoundException {
        System.out.println("--------------------------------------");
        System.out.println("Read User from JSON example");
        System.out.println();

        String json = new Scanner(new File("files/lesson10/user.json")).useDelimiter("\\Z").next();

        User user = JSON.parseObject(json, User.class);

        System.out.println(json);
        System.out.println(user);
        System.out.println();
    }

    static void groupReadExample() throws FileNotFoundException {
        System.out.println("--------------------------------------");
        System.out.println("Read Group from JSON example");
        System.out.println();

        String json = new Scanner(new File("files/lesson10/group.json")).useDelimiter("\\Z").next();

        UserGroup group = JSON.parseObject(json, UserGroup.class);

        System.out.println(json);
        System.out.println(group);
        System.out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        simpleExample();
        groupExample();
        userReadExample();
        groupReadExample();
    }
}
