package ru.job4j.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        List<ItemTracker> items = new ArrayList<>();
        for (ItemTracker itemTracker : items) {
            output.accept(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
        }
        return true;
    }
}
