package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoopIndex.indexOf(data, min, i, data.length);
            if (index== -1) {
                break;
            } else {
                int t = data[i];
                data[i] = data[index];
                data[index] = t;
            }
        } return data;
    }
}
