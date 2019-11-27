package ru.job4j.Encapsulation;

public class BreakDependency {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name: ");
                String name = input.askStr("");
                ItemTracker itemtracker = new ItemTracker(name);
                tracker.add(itemtracker);
            } else if(select == 1) {
                System.out.println("=== Show all items ===");
                ItemTracker[] items = tracker.findAll();
                for (ItemTracker itemTracker : items ) {
                    System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
                }
            } else if(select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println(("Enter the item id you need to edit"));
                String id = input.askStr("");
                String name = input.askStr("");
                ItemTracker itemtracker = new ItemTracker(name);
                tracker.replace(id, itemtracker);

            } else if(select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("Enter item id");
                String id = input.askStr("");
                tracker.delete(id);

            } else if(select == 4) {
                System.out.println("=== Find item by id ===");
                System.out.println("Enter item id");
                String id = input.askStr("");
                tracker.findById(id);

            } else if(select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter item name");
                String name = input.askStr("");
                tracker.findByName(name);

            } else if(select == 6) {
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

    // почему в задании это называется Start.main? где Start?
    public static void main (String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new BreakDependency().init(input, tracker);
    }
}
