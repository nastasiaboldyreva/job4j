package ru.job4j.encapsulation;

public class FindAllAction implements UserAction{
    @Override
    public String name() {
        return "Find all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for(ItemTracker itemtracker: tracker.findAll()) {
            System.out.println(String.format("%s %s", itemtracker.getId(), itemtracker.getName()));
        }
        return true;
    }
}



