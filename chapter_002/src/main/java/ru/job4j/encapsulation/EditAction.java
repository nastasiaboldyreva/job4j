package ru.job4j.encapsulation;

import java.util.function.Consumer;

public class EditAction implements UserAction {

    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("=== Edit item ===");
        String id = input.askStr("Enter id ");
        String name = input.askStr("Enter name");
        ItemTracker itemtracker = new ItemTracker(name);
        if (tracker.replace(id, itemtracker)) {
            output.accept(String.format("Item with id %s and name %s replaced", itemtracker.getId(), itemtracker.getName()));
        } else {
            output.accept("Something wrong happened. Pls check id and name.");
        }
        return true;
    }
}
