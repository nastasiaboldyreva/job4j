package ru.job4j.collection.user;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;
    private int priority;

    public User(String name, int age, int priority) {
        this.name = name;
        this.age = age;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPriority() {
        return priority;
    }


    @Override
    public int compareTo(User o) {
        int rsl = this.name.compareTo(o.name);
        if (rsl == 0) {
            rsl = Integer.compare(this.age, o.age);
        }
        return rsl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
