package ru.job4j.strategy;

public class TriangleShape implements Shape{
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("+" + System.lineSeparator());
        pic.append("++" + System.lineSeparator());
        pic.append("+++" + System.lineSeparator());
        pic.append("++++" + System.lineSeparator());
        return pic.toString();
    }
}

