package ru.job4j.encapsulation;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name");
        ItemTracker[] items = tracker.findByName(name);
        for (ItemTracker itemTracker : items) {
            System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
        }
        return true;
    }
}
