package ru.job4j.encapsulation;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create new item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter name: ");
        String name = input.askStr("");
        ItemTracker itemtracker = new ItemTracker(name);
        tracker.add(itemtracker);
        return true;
    }
}
