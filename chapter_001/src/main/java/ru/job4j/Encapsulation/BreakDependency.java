package ru.job4j.Encapsulation;

public class BreakDependency {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                ItemTracker itemtracker = new ItemTracker(name);
                tracker.add(itemtracker);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                ItemTracker[] items = tracker.findAll();
                for (ItemTracker itemTracker : items) {
                    System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                String id = input.askStr("Enter id ");
                String name = input.askStr("Enter name");
                ItemTracker itemtracker = new ItemTracker(name);
                if (tracker.replace(id, itemtracker)) {
                    System.out.println(String.format("Item with id %s and name %s replaced", itemtracker.getId(), itemtracker.getName()));
                } else {
                    System.out.println("Something wrong happened. Pls recheck id and name.");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                String id = input.askStr("Enter id");
                if (tracker.delete(id)) {
                    System.out.println(String.format("id %s deleted", id));
                } else {
                    System.out.println("Something wrong happened. Pls recheck id");
                }

            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                String id = input.askStr("Enter id");
                ItemTracker itemTracker = tracker.findById(id);
                if (tracker.findById(id) != null) {
                    System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
                } else {
                    System.out.println("Something wrong happened. Pls recheck id");
                }



            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String name = input.askStr("Enter name");
                ItemTracker[] items = tracker.findByName(name);
                tracker.findByName(name);
                for (ItemTracker itemTracker : items) {
                    System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
                }

            } else if (select == 6) {
                run = false;
            }

        }
    }

    private void showMenu() {
        System.out.println("Menu: ");
        System.out.println("1. Create new item");
        System.out.println("2. Show all items");
        System.out.println("3. Edit item");
        System.out.println("4. Delete item");
        System.out.println("5. Find item by id");
        System.out.println("6. Find items by name");
        System.out.println("Exit");
    }

    public static void main(String[] args){
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new BreakDependency().init(input, tracker);
    }
}
