package ru.job4j.encapsulation;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ItemTracker[] items = tracker.findAll();
        for (ItemTracker itemTracker : items) {
            System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
        }
        return true;
    }
}
