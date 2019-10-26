package ru.job4j.tracker;

public class ItemOverload {

    public ItemOverload() {
        super();
        System.out.println("load itemOverload");
    }

    public ItemOverload(String name) {
    }

    public static void main(String[] args) {
        ItemOverload itemOverload = new ItemOverload();
    }
}
