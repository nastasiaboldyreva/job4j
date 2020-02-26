package ru.job4j.encapsulation;

import java.util.List;
import java.util.function.Consumer;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String name = input.askStr("Enter name");
        List<ItemTracker> items = tracker.findByName(name);
        for (ItemTracker itemTracker : items) {
            output.accept(String.format("%s %s", itemTracker.getId(), itemTracker.getName()));
        }
        return true;
    }
}
