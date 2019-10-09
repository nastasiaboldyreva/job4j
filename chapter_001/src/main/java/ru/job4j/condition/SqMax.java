package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            }
        } else {
            result = third;
        }

        if (second > first) {
            if (second > forth) {
                result = first;
            }
        } else if (third > forth) {
            if (third > first) {
                result = third;
            }
        } else if (forth > first) {
            result = forth;
        }
        return result;
    }
}
