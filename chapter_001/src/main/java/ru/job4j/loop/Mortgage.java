package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double a = (double) amount;
        double s = (double) salary;
        // double x = a + (a * percent)/100 - s;
        double x;
        while (x>=0) {
            x = a + (a * percent)/100 - s;
            year ++;
        }
        return year;
    }
}