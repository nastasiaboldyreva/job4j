package ru.job4j.Encapsulation;

public class StaticMethod {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        System.out.println("Enter name: ");
        String name = input.askStr("");
        ItemTracker itemtracker = new ItemTracker(name);
        tracker.add(itemtracker);
    }

    public static void showItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        ItemTracker[] items = tracker.findAll();
        for (ItemTracker itemTracker : items ) {
            System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        System.out.println(("Enter the item id you need to edit"));
        String id = input.askStr("");
        String name = input.askStr("");
        ItemTracker itemtracker = new ItemTracker(name);
        tracker.replace(id, itemtracker);
        System.out.println("Your new item is:" + itemtracker.getName());
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        System.out.println("Enter item id");
        String id = input.askStr("");
        tracker.delete(id);
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        System.out.println("Enter item id");
        String id = input.askStr("");
        tracker.findById(id);
        ItemTracker itemTracker = tracker.findById(id);
        System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        System.out.println("Enter item name");
        String name = input.askStr("");
        tracker.findByName(name);
        ItemTracker[] items = tracker.findByName(name);
        for (ItemTracker itemTracker : items ) {
            System.out.println(String.format("%s: %s", itemTracker.getId(), itemTracker.getName()));
        }
    }



    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                StaticMethod.createItem(input, tracker);
            } else if(select == 1) {
                StaticMethod.showItems(input, tracker);
            } else if(select == 2) {
                StaticMethod.editItem(input, tracker);
            } else if(select == 3) {
                StaticMethod.deleteItem(input, tracker);
            } else if(select == 4) {
                StaticMethod.findById(input, tracker);
            } else if(select == 5) {
                StaticMethod.findByName(input, tracker);
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

    public static void main (String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StaticMethod().init(input, tracker);
    }
}

