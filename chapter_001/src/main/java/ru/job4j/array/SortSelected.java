package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoopIndex.indexOf(data, min, 0, data.length);
        for (int i=0;i<data.length;i++) {
            int tmp = data[0];
            data[0]=data[index];
            data[index]=tmp;
            for (int j=1; j<data.length;j++) {
                if(data[j]<min) {
                    data[j]=min;
                }
            }
            data[i]=i+1;

        }
        return data;
    }
}