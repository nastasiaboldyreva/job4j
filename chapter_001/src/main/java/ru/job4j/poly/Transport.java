package ru.job4j.poly;

public interface Transport {

    int drive();
    int passangers(int quantity);
    int refuel(int fuel, int price);
}
