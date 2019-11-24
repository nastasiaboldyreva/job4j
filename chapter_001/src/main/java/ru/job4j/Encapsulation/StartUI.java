package ru.job4j.Encapsulation;

import ru.job4j.tracker.Item;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                ItemTracker itemtracker = new ItemTracker(name);
                tracker.add(itemtracker);
            } else if(select == 1) {
                System.out.println("=== Show all items ===");
                String allitems = scanner.nextLine();
                ItemTracker itemtracker = new ItemTracker(allitems);
                tracker.findAll(itemtracker);

            } else if(select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println(("Enter the item id you need to edit"));
                String id = scanner.nextLine();
                ItemTracker itemtracker = new ItemTracker(id);
                tracker.replace(itemtracker);

            } else if(select == 3) {
                System.out.println("=== Delete item ===");
                //ввести имя заявки и удалить его

            } else if(select == 4) {
                System.out.println("=== Find item by id ===");
                //запросить if заявки и потом отобразить ее на экране

            } else if(select == 5) {
                System.out.println("=== Find items by name ===");
                //запросить имя заявки и потом вывести его на экране

            } else if(select == 6) {
                run = false;
            }

        }
    }

    private void showMenu() {
        System.out.println("Menu");
        System.out.println("");
        // остальные пункты добавить
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
