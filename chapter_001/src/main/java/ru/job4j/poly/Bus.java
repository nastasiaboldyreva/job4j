package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public int drive() {
        return 0;
    }

    @Override
    public int passangers(int quantity) {
        return 0;
    }

    @Override
    public int refuel(int fuel, int price) {
        return 0;
    }
}
