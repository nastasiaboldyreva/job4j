package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {

        for (int i=0;i<data.length;i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoopIndex.indexOf(data, min, 0, data.length);
            data[i]=min;
            index=i;
            int tmp=data[0];
            data[0]=data[i];
            data[i]=tmp;

            for (int j=1; j<data.length-1;j++) {
                if(data[j]<min) {
                    min=data[j];
                    index=j;
                }
                int tmp2=data[j];
                data[j]=data[index];
                data[index]=tmp2;
            }
        }
        return data;
    }
}
