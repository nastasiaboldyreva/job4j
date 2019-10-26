package ru.job4j.tracker;

public class PredatorOverload extends AnimalOverload{

    public PredatorOverload() {
        super();
        System.out.println("PredatorOverload");
    }

    public PredatorOverload(String name) {
        super(name);
    }

    public static void main(String[] args) {
        PredatorOverload predatorOverload = new PredatorOverload();
    }
}
