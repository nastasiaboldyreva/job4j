package ru.job4j.encapsulation;

import java.util.function.Consumer;

public class    DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("=== Delete item ===");
        String id = input.askStr("Enter id");
        if (tracker.delete(id)) {
            System.out.println(String.format("id %s deleted", id));
        } else {
            System.out.println("Something wrong happened. Pls check id and name.");
        }
        return true;
    }
}
