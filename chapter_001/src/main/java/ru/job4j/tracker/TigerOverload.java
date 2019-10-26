package ru.job4j.tracker;

public class TigerOverload extends PredatorOverload{

    public TigerOverload() {
        super();
        System.out.println("TigerOverload");
    }

    public TigerOverload(String name) {
        super(name);
    }

    public static void main(String[] args) {
        TigerOverload tigerOverload = new TigerOverload();
    }
}
