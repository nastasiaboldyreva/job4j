package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double a = (double) amount;
        double s = (double) salary;
        while (a>=0) {
            a = a + (a * percent/100) - s;
            year ++;
        }
        return year;
    }
}