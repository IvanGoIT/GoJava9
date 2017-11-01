package lesson.lesson10.json;

import lesson.lesson10.enumeration.User;

import java.util.ArrayList;

public class UserGroup {
    public String name;
    public ArrayList<User> users = new ArrayList<>();

    public int getGroupSize() {
        return users.size();
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
