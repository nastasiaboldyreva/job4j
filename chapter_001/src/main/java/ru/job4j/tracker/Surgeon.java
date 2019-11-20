package ru.job4j.tracker;

public class Surgeon extends Doctor {

    public String scalpel;
    public String bandage;

    public void operate() {

    }

    public String getName() {
        return bandage;
    }

    public String getSurname() {
        return scalpel;
    }
}
