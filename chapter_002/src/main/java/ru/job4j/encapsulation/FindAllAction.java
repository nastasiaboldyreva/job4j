package ru.job4j.encapsulation;

import java.util.function.Consumer;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Find all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        for (ItemTracker itemtracker: tracker.findAll()) {
            output.accept(String.format("%s %s", itemtracker.getId(), itemtracker.getName()));
        }
        return true;
    }
}



