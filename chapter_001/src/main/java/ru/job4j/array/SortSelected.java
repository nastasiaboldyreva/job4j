package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        for (int k = 0; k < data.length; k++) {
            data[0]=min;
        }
        return data;
    }
}
