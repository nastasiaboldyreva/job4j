package ru.job4j.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        //ItemTracker[] items = tracker.findAll();
        List<ItemTracker> items = new ArrayList<>();
        for (ItemTracker itemTracker : items) {
            System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
        }
        return true;
    }
}
