package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //compareTo должен сравнить имена, если они равны, то сравнить возраст.
    @Override
    public int compareTo(User o) {
        int rsl = this.name.compareTo(o.name);
        if(rsl == 0) {
            rsl = Integer.compare(this.age, o.age);
        } return rsl;
    }

    //методы equals и hashCode нужны для тестов, где мы используем методы сравнения моделей user.equals.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
