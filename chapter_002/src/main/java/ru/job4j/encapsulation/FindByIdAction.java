package ru.job4j.encapsulation;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        String id = input.askStr("Enter id");
        ItemTracker itemTracker = tracker.findById(id);
        if (tracker.findById(id) != null) {
            System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
        } else {
            System.out.println("Something wrong happened. Pls recheck id");
        }
        return true;
    }
}
