package ru.job4j.encapsulation;

import java.util.Comparator;

public class ItemTracker implements Comparable<ItemTracker>{
    private String id;
    private String name;

    public ItemTracker(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ItemTracker o) {
        return name.compareTo(o.getName());
    }
}

class ItemTrackerSort implements Comparator<ItemTracker> {
    @Override
    public int compare(ItemTracker o1, ItemTracker o2) {
        return o1.getName().compareTo(o2.getName());
    }
}