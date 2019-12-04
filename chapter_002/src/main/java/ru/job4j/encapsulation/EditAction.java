package ru.job4j.encapsulation;

public class EditAction implements UserAction {

    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter id ");
        String name = input.askStr("Enter name");
        ItemTracker itemtracker = new ItemTracker(name);
        if (tracker.replace(id, itemtracker)) {
            System.out.println(String.format("Item with id %s and name %s replaced", itemtracker.getId(), itemtracker.getName()));
        } else {
            System.out.println("Something wrong happened. Pls check id and name.");
        }
        return true;
    }
}
