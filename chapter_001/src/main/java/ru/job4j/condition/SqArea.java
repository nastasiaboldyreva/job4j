package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = h * k;
        int s = w * h;
        return s;
    }
}
