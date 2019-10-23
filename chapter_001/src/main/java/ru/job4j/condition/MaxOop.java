package ru.job4j.condition;

public class MaxOop {

    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public int max(int left, int right, int top) {
        return max (
                left,
                max(right, top)
        );
    }

    public int max (int left, int right, int top, int bottom) {
        return max (
                left, right,
                max(top, bottom)
        );
    }
}



