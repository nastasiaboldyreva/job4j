package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoopIndex.indexOf(data, min, 0, data.length);
        for(int i=0;i<data.length;i++) {
            data[0]=min;

        }


        return data;
    }
}