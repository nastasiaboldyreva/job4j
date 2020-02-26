package ru.job4j.encapsulation;

import java.util.function.Consumer;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("=== Find item by id ===");
        String id = input.askStr("Enter id");
        ItemTracker itemTracker = tracker.findById(id);
        if (tracker.findById(id) != null) {
            output.accept(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
        } else {
            output.accept("Something wrong happened. Pls recheck id");
        }
        return true;
    }
}
