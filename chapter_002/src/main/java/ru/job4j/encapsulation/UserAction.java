package ru.job4j.encapsulation;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
